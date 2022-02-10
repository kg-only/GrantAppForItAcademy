package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_provider_advert.AdapterForProviderAdverts
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentProvederAdvertsBinding
import com.example.grantappforitacademy.main.ui.grants.InfoGrantFragment
import com.example.grantappforitacademy.main.ui.provider_adverts.comments_fragment.ProviderAdvertsCommentsFragment
import com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_comment_create.ProviderAdvertsCommentsCreateFragment
import com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_post_fragment.ProviderAdvertsPostFragment
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import com.example.grantappforitacademy.responsemodel.ProviderAdvertComment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentProvederAdvertsBinding
private lateinit var adapter: AdapterForProviderAdverts

class ProviderAdvertsFragment : BaseFragmentMvp<ProviderAdvertsContract.View,
        ProviderAdvertsContract.Presenter>(R.layout.fragment_proveder_adverts),
    ProviderAdvertsContract.View {

    override val presenter: ProviderAdvertsPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentProvederAdvertsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenterScope.launch {
            presenter.getDataFromApi()
        }
        recyclerView()
        binding.addAdvert.setOnClickListener{
            changeFragment(ProviderAdvertsPostFragment(),R.id.frame_layout)
        }
    }///////////////////////////////

    private fun recyclerView() {
        adapter = AdapterForProviderAdverts(onClick = { startInfoFragment(it) })
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }

    private fun startInfoFragment(providerAdverts: ProviderAdvert) {
        val data = Bundle()
        data.putParcelable("data", providerAdverts)
        val info = ProviderAdvertsCommentsFragment()
        info.arguments = data
        changeFragment(info, R.id.frame_layout)
    }

    override fun getResultList(item: List<ProviderAdvert>) {
        adapter.setItems(item)
    }
}