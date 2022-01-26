package com.example.grantappforitacademy.main.ui.grantsfragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Event
import com.example.grantappforitacademy.responsemodel.Grant

interface GrantsContract {
    interface View : MvpView {
         fun getResultList(item: List<Grant>)

    }

    interface Presenter : MvpPresenter<View> {
        suspend fun getDataFromApi(method: String)

    }
}