package com.example.grantappforitacademy.main.ui.grants.grant_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adater_grant.AdapterForGrant
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentGrantsBinding
import com.example.grantappforitacademy.main.ui.grants.InfoGrantFragment
import com.example.grantappforitacademy.responsemodel.Grant
import com.example.grantappforitacademy.responsemodel.GrantComment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentGrantsBinding
private lateinit var adapter: AdapterForGrant

class GrantsFragment : BaseFragmentMvp<GrantContract.View,
        GrantContract.Presenter>(R.layout.fragment_grants), GrantContract.View {

    override val presenter: GrantPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentGrantsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenterScope.launch {
            presenter.getDataFromApi()
        }
        recyclerView()
    }///////////////////////////////

    override fun getResultList(item: List<Grant>) {
        adapter.setItems(item)
    }
    private fun recyclerView() {
        adapter = AdapterForGrant(onClick = { startInfoFragment(it) })
        binding.recyclerGrant.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerGrant.adapter = adapter
    }
    private fun startInfoFragment(grant: Grant) {
        val data = Bundle()
        data.putParcelable("data", grant)
        val info = InfoGrantFragment()
        info.arguments = data
        changeFragment(info, R.id.frame_layout)
    }
}