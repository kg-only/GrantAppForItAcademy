package com.example.grantappforitacademy.main.ui.newsletter_list

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Contacts
import com.example.grantappforitacademy.responsemodel.Event
import com.example.grantappforitacademy.responsemodel.Login

interface NewsletterListContract {
    interface View : MvpView {
        fun getResultList(item: List<Contacts>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi()

    }
}