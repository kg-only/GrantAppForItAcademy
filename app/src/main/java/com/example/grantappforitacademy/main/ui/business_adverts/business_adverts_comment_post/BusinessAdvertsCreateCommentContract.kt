package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment_post

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.BusinessAdvertCommentPost

interface BusinessAdvertsCreateCommentContract {
    interface View : MvpView {
//         fun getResultList(item: List<Event>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(businessAdvertCommentPost: BusinessAdvertCommentPost)

    }
}