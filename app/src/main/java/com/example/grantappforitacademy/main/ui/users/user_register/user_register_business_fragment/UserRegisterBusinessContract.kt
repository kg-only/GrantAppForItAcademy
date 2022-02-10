package com.example.grantappforitacademy.main.ui.users.user_register.user_register_business_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.*

interface UserRegisterBusinessContract {
    interface View : MvpView {
    }

    interface Presenter : MvpPresenter<View> {
        fun getDataFromApi(userBusinessProfile: UserBusinessProfile)

    }
}