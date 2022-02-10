package com.example.grantappforitacademy.main.ui.blogposts.blog_create_comment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.BlogCreateComment

interface BlogCreateCommentContract {
    interface View : MvpView {
//         fun getResultList(item: List<Grant>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(blogCreateComment: BlogCreateComment)

    }
}