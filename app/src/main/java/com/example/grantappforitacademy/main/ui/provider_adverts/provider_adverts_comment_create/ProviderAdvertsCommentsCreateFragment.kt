package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_comment_create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adater_grant.AdapterForGrant
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentProviderAdvertsCommentsCreateBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentProviderAdvertsCommentsCreateBinding
private lateinit var adapter: AdapterForGrant

class ProviderAdvertsCommentsCreateFragment :
    BaseFragmentMvp<ProviderAdvertsCommentCreateContract.View,
            ProviderAdvertsCommentCreateContract.Presenter>(R.layout.fragment_provider_adverts_comments_create),
    ProviderAdvertsCommentCreateContract.View {

    override val presenter: ProviderAdvertsCommentCreatePresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentProviderAdvertsCommentsCreateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            addComment.setOnClickListener {
                presenterScope.launch {
                    presenter.getDataFromApi(providerAdvertComment = ProviderAdvertComment(
                        post = 1,
                        text = text.text.toString(),
                        user = User(id = id.text.toString().toInt(),
                            avatar = null,
                            firstName = firstName.text.toString(),
                            lastName = lastName.text.toString())))
                }
                changeFragment(ProviderAdvertsFragment(), R.id.frame_layout)
            }
        }
    }

}
