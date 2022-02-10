package com.example.grantappforitacademy.main.ui.grants.grant_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Grant

interface GrantContract {
    interface View : MvpView {
         fun getResultList(item: List<Grant>)

    }

    interface Presenter : MvpPresenter<View> {
        suspend fun getDataFromApi()

    }
}