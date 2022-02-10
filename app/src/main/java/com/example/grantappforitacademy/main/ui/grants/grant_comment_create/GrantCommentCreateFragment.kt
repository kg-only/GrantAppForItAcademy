package com.example.grantappforitacademy.main.ui.grants.grant_comment_create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adater_grant.AdapterForGrant
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentGrantCommentCreateBinding
import com.example.grantappforitacademy.main.ui.grants.grant_fragment.GrantsFragment
import com.example.grantappforitacademy.responsemodel.GrantComment
import com.example.grantappforitacademy.responsemodel.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentGrantCommentCreateBinding
private lateinit var adapter: AdapterForGrant

class GrantCommentCreateFragment : BaseFragmentMvp<GrantCommentCreateContract.View,
        GrantCommentCreateContract.Presenter>(R.layout.fragment_grant_comment_create),
    GrantCommentCreateContract.View {

    override val presenter: GrantCommentCreatePresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentGrantCommentCreateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            addComment.setOnClickListener {
                presenter.getDataFromApi(grantComment = GrantComment(
                    post = null,
                    text = text.text.toString(),
                    user = User(id = id.text.toString().toInt(),
                        avatar = null,
                        firstName = firstName.text.toString(),
                        lastName = lastName.text.toString())))
                changeFragment(GrantsFragment(), R.id.frame_layout)
            }
        }
    }///////////////////////////////

}