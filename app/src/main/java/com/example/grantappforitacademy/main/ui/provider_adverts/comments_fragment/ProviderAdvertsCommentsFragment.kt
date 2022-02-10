package com.example.grantappforitacademy.main.ui.provider_adverts.comments_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_provider_advert.AdapterForProviderAdvertComments
import com.example.grantappforitacademy.common.mvp.BaseFragment
import com.example.grantappforitacademy.databinding.FragmentProviderAdvertsCommentsBinding
import com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_comment_create.ProviderAdvertsCommentsCreateFragment
import com.example.grantappforitacademy.responsemodel.ProviderAdvert

private lateinit var binding: FragmentProviderAdvertsCommentsBinding
private lateinit var dataResult: ProviderAdvert
private lateinit var adapter: AdapterForProviderAdvertComments

class ProviderAdvertsCommentsFragment : BaseFragment(R.layout.fragment_provider_adverts_comments) {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentProviderAdvertsCommentsBinding.inflate(inflater, container, false)
        dataResult = requireArguments().getParcelable("data")!!
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView()
        adapter.setItems(dataResult.comments)

        binding.addComment.setOnClickListener {
            changeFragment(ProviderAdvertsCommentsCreateFragment(), R.id.frame_layout)
        }
    }


    private fun recyclerView() {
        adapter = AdapterForProviderAdvertComments()
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }
}