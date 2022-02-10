package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment_post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentBusinessAdvertsCreateCommentBinding
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts.BusinessAdvertsFragment
import com.example.grantappforitacademy.responsemodel.BusinessAdvertCommentPost
import com.example.grantappforitacademy.responsemodel.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentBusinessAdvertsCreateCommentBinding

class BusinessAdvertsCreateCommentFragment :
    BaseFragmentMvp<BusinessAdvertsCreateCommentContract.View,
            BusinessAdvertsCreateCommentContract.Presenter>(R.layout.fragment_business_adverts_create_comment),
    BusinessAdvertsCreateCommentContract.View {

    override val presenter: BusinessAdvertsCreateCommentPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBusinessAdvertsCreateCommentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            addComment.setOnClickListener {
                presenter.getDataFromApi(businessAdvertCommentPost = BusinessAdvertCommentPost(
                    post = 1,
                    text = text.text.toString(),
                    user = User(id = id.text.toString().toInt(),
                        avatar = null,
                        firstName = firstName.text.toString(),
                        lastName = lastName.text.toString())))
                changeFragment(BusinessAdvertsFragment(), R.id.frame_layout)
            }
        }
    }
}