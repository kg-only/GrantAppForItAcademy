package com.example.grantappforitacademy.main.ui.events.event

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Event

interface EventContract {
    interface View : MvpView {
         fun getResultList(item: List<Event>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi()

    }
}