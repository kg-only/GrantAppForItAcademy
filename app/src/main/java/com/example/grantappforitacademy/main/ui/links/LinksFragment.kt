package com.example.grantappforitacademy.main.ui.links

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_links.AdapterForLinks
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentLinksBinding
import com.example.grantappforitacademy.responsemodel.Links
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentLinksBinding
private lateinit var adapter: AdapterForLinks

class LinksFragment : BaseFragmentMvp<LinksContract.View,
        LinksContract.Presenter>(R.layout.fragment_links), LinksContract.View {

    override val presenter: LinksPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLinksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenterScope.launch {
            presenter.getDataFromApi()
        }
        recyclerView()
    }

    private fun recyclerView() {
        adapter = AdapterForLinks()
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }

    override fun getResultList(item: List<Links>) {
        adapter.setItems(item)
    }
}