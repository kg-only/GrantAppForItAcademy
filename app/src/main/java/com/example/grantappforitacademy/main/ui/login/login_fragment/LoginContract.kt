package com.example.grantappforitacademy.main.ui.login.login_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Login

interface LoginContract {
    interface View : MvpView {

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(login: Login)

    }
}