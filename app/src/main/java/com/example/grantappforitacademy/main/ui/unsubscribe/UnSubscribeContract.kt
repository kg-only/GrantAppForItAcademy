package com.example.grantappforitacademy.main.ui.unsubscribe

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Contacts
import com.example.grantappforitacademy.responsemodel.Grant
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers

interface UnSubscribeContract {
    interface View : MvpView {
    }

    interface Presenter : MvpPresenter<View> {
        fun getDataFromApi(email: String)

    }
}