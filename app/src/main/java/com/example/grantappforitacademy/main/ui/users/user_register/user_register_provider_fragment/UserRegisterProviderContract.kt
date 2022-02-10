package com.example.grantappforitacademy.main.ui.users.user_register.user_register_provider_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.*

interface UserRegisterProviderContract {
    interface View : MvpView {
    }

    interface Presenter : MvpPresenter<View> {
        fun getDataFromApi(userProviderProfile: UserProviderProfile)

    }
}