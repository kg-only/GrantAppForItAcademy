package com.example.grantappforitacademy.main.ui.login.login_refresh_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView

interface LoginRefreshContract {
    interface View : MvpView {

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi()

    }
}