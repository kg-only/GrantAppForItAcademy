package com.example.grantappforitacademy.main.ui.blogposts.blog_create_comment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.BlogCreateComment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BlogCreateCommentPresenter(private val interactor: Interactor) :
    BasePresenter<BlogCreateCommentContract.View>(),
    BlogCreateCommentContract.Presenter {

    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override fun getDataFromApi(blogCreateComment: BlogCreateComment) {
        presenterScope.launch {
            try {
                interactor.postBlogCreateComment(blogCreateComment)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
