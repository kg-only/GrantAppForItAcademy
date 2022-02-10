package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_business_adverts.AdapterForBusinessAdverts
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentBusinessAdvertsBinding
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment.BusinessAdvertsCommentFragment
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_post.BusinessAdvertsPostFragment
import com.example.grantappforitacademy.responsemodel.BusinessAdvert
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentBusinessAdvertsBinding
private lateinit var adapter: AdapterForBusinessAdverts

class BusinessAdvertsFragment : BaseFragmentMvp<BusinessAdvertsContract.View,
        BusinessAdvertsContract.Presenter>(R.layout.fragment_business_adverts),
    BusinessAdvertsContract.View {

    override val presenter: BusinessAdvertsPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBusinessAdvertsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView()
        presenter.getDataFromApi()
        binding.addAdvert.setOnClickListener {
            changeFragment(BusinessAdvertsPostFragment(),R.id.frame_layout)
        }

    }

    private fun recyclerView() {
        adapter = AdapterForBusinessAdverts(onClick = {startInfoFragment(it)})
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }

    override fun getResultList(item: List<BusinessAdvert>) {
        adapter.setItems(item)
    }

    private fun startInfoFragment(dataa: BusinessAdvert) {
        val data = Bundle()
        data.putParcelable("data", dataa)
        val info = BusinessAdvertsCommentFragment()
        info.arguments = data
        changeFragment(info, R.id.frame_layout)
    }
}