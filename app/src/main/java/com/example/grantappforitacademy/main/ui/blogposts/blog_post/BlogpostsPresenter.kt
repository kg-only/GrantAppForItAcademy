package com.example.grantappforitacademy.main.ui.blogposts.blog_post

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BlogpostsPresenter(private val interactor: Interactor) :
    BasePresenter<BlogpostsContract.View>(),
    BlogpostsContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override fun getDataFromApi() {
        presenterScope.launch {
            try {
                val data = interactor.getBlogpost()
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
