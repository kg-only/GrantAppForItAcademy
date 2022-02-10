package com.example.grantappforitacademy.main.ui.blogposts.blog_post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_blogpost.AdapterForBlogpost
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentBlogpostsBinding
import com.example.grantappforitacademy.main.ui.blogposts.InfoBlogPostFragment
import com.example.grantappforitacademy.responsemodel.BlogPost
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentBlogpostsBinding
private lateinit var adapter: AdapterForBlogpost

class BlogpostsFragment : BaseFragmentMvp<BlogpostsContract.View,
        BlogpostsContract.Presenter>(R.layout.fragment_blogposts), BlogpostsContract.View {

    override val presenter: BlogpostsPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBlogpostsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView()
        presenter.getDataFromApi()
    }

    private fun recyclerView() {
        adapter = AdapterForBlogpost(onClick = { startInfoFragment(it) })
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }

    override fun getResultList(data: List<BlogPost>) {
        adapter.setItems(data)
    }

    private fun startInfoFragment(blogPost: BlogPost) {
        val data = Bundle()
        data.putParcelable("blogPost", blogPost)
        val info = InfoBlogPostFragment()
        info.arguments = data
        changeFragment(info, R.id.frame_layout)
    }
}