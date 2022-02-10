package com.example.grantappforitacademy.main.ui.users.user_business_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.*

interface UserBusinessContract {
    interface View : MvpView {
        fun getResultList(item: List<UserBusinessProfile>)
    }

    interface Presenter : MvpPresenter<View> {
        fun getDataFromApi()

    }
}