package com.example.grantappforitacademy.main.ui.grants.grant_comments_fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adater_grant.AdapterForGrantComment
import com.example.grantappforitacademy.common.mvp.BaseFragment
import com.example.grantappforitacademy.databinding.FragmentGrantCommentsBinding
import com.example.grantappforitacademy.main.ui.grants.grant_comment_create.GrantCommentCreateFragment
import com.example.grantappforitacademy.responsemodel.Grant

private lateinit var binding: FragmentGrantCommentsBinding
private lateinit var adapter: AdapterForGrantComment
private lateinit var dataResult: Grant

class GrantCommentsFragment : BaseFragment(R.layout.fragment_grant_comments) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentGrantCommentsBinding.inflate(inflater, container, false)
        dataResult = requireArguments().getParcelable("dataFromInfoFragment")!!
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView()
        adapter.setItems(dataResult.comments)
        binding.addComment.setOnClickListener {
            changeFragment(GrantCommentCreateFragment(), R.id.frame_layout)
        }
    }

    private fun recyclerView() {
        adapter = AdapterForGrantComment()
        binding.recyclerGrant.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerGrant.adapter = adapter
    }
}