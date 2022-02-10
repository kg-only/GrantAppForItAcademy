package com.example.grantappforitacademy.main.ui.blogposts.blog_create_comment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentBlogCreateCommentBinding
import com.example.grantappforitacademy.main.ui.blogposts.blog_post.BlogpostsFragment
import com.example.grantappforitacademy.responsemodel.BlogCreateComment
import com.example.grantappforitacademy.responsemodel.User
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentBlogCreateCommentBinding

class BlogCreateCommentFragment : BaseFragmentMvp<BlogCreateCommentContract.View,
        BlogCreateCommentContract.Presenter>(R.layout.fragment_blog_create_comment),
    BlogCreateCommentContract.View {

    override val presenter: BlogCreateCommentPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBlogCreateCommentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            addComment.setOnClickListener {
                presenter.getDataFromApi(blogCreateComment = BlogCreateComment(
                    post = 1,
                    text = text.text.toString(),
                    user = User(id = id.text.toString().toInt(),
                        avatar = null,
                        firstName = firstName.text.toString(),
                        lastName = lastName.text.toString())))
                changeFragment(BlogpostsFragment(), R.id.frame_layout)
            }
        }
    }
}