package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_business_adverts.AdapterForBusinessAdvertComments
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentBusinessAdvertsCommentBinding
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment_post.BusinessAdvertsCreateCommentFragment
import com.example.grantappforitacademy.responsemodel.BusinessAdvert
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentBusinessAdvertsCommentBinding
private lateinit var dataResult: BusinessAdvert
private lateinit var adapter: AdapterForBusinessAdvertComments

class BusinessAdvertsCommentFragment : BaseFragmentMvp<BusinessAdvertsCommentContract.View,
        BusinessAdvertsCommentContract.Presenter>(R.layout.fragment_business_adverts_comment),
    BusinessAdvertsCommentContract.View {

    override val presenter: BusinessAdvertsCommentPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBusinessAdvertsCommentBinding.inflate(inflater, container, false)
        dataResult = requireArguments().getParcelable("data")!!
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView()
        adapter.setItems(dataResult.comment)

        binding.addComment.setOnClickListener {
            changeFragment(BusinessAdvertsCreateCommentFragment(), R.id.frame_layout)
        }
    }

    private fun recyclerView() {
        adapter = AdapterForBusinessAdvertComments()
        binding.recyclerComments.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerComments.adapter = adapter
    }
}