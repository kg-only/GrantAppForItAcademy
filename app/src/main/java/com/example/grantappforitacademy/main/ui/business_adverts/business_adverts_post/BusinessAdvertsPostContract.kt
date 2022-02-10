package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_post

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.BusinessAdvertPost

interface BusinessAdvertsPostContract {
    interface View : MvpView {

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(businessAdvertPost: BusinessAdvertPost)

    }
}