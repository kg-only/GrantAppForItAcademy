package com.example.grantappforitacademy.main.ui.blogposts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_blogpost.AdapterForBlogpostComments
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentInfoBlogPostBinding
import com.example.grantappforitacademy.main.ui.blogposts.blog_create_comment.BlogCreateCommentFragment
import com.example.grantappforitacademy.main.ui.blogposts.blog_post.BlogpostsContract
import com.example.grantappforitacademy.main.ui.blogposts.blog_post.BlogpostsPresenter
import com.example.grantappforitacademy.responsemodel.BlogPost
import com.squareup.picasso.Picasso
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentInfoBlogPostBinding
private lateinit var dataResult: BlogPost
private lateinit var adapter: AdapterForBlogpostComments

class InfoBlogPostFragment : BaseFragmentMvp<BlogpostsContract.View,
        BlogpostsContract.Presenter>(R.layout.fragment_info_blog_post), BlogpostsContract.View {

    override val presenter: BlogpostsPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentInfoBlogPostBinding.inflate(inflater, container, false)
        dataResult = requireArguments().getParcelable("blogPost")!!
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            titleInfoTextView.text = dataResult.title
            subTitleInfoTextView.text = dataResult.subtitle
            description.text = dataResult.description
            Picasso.get().load(dataResult.postImage).resize(400, 400)
                .centerCrop().into(imageInfoView)
            createdTextView.text = dataResult.created

            addComment.setOnClickListener {
                changeFragment(BlogCreateCommentFragment(), R.id.frame_layout)
            }
        }
        recyclerView()
        adapter.setItems(dataResult.comments)


    }

    private fun recyclerView() {
        adapter = AdapterForBlogpostComments()
        binding.recyclerComments.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerComments.adapter = adapter
    }

    override fun getResultList(data: List<BlogPost>) {
    }

//    override fun getResultList(data: List<BlogPost>) {
//    }
}