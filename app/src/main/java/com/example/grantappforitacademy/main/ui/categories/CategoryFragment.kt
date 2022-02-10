//package com.example.grantappforitacademy.main.ui.category_fragment
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.grantappforitacademy.R
//import com.example.grantappforitacademy.adapter.adapter_blogpost.AdapterForBlogpost
//import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
//import com.example.grantappforitacademy.databinding.FragmentBlogpostsBinding
//import com.example.grantappforitacademy.databinding.FragmentCategoryBinding
//import com.example.grantappforitacademy.main.ui.blogposts_fragment.blog_post.BlogpostsContract
//import com.example.grantappforitacademy.main.ui.blogposts_fragment.blog_post.BlogpostsPresenter
//import org.koin.android.ext.android.inject
//
//private lateinit var binding: FragmentCategoryBinding
//private lateinit var adapter: AdapterForBlogpost
//
//class CategoryFragment : BaseFragmentMvp<BlogpostsContract.View,
//        BlogpostsContract.Presenter>(R.layout.fragment_blogposts), BlogpostsContract.View {
//
//    override val presenter: BlogpostsPresenter by inject()
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?,
//    ): View {
//        binding = FragmentCategoryBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
////
////        recyclerView()
////        presenter.getDataFromApi()
//    }
//}
//
////    private fun recyclerView() {
////        adapter = AdapterForBlogpost(onClick = { startInfoFragment(it) })
////        binding.recycler.layoutManager =
////            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
////        binding.recycler.adapter = adapter
////    }