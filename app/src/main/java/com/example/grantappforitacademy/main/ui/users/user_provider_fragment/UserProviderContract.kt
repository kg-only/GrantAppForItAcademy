package com.example.grantappforitacademy.main.ui.users.user_provider_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.*

interface UserProviderContract {
    interface View : MvpView {
        fun getResultList(item: List<UserProviderProfile>)
    }

    interface Presenter : MvpPresenter<View> {
        fun getDataFromApi()

    }
}