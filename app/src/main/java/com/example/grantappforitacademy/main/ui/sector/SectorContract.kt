package com.example.grantappforitacademy.main.ui.sector

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Grant
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers
import com.example.grantappforitacademy.responsemodel.Sector

interface SectorContract {
    interface View : MvpView {
        fun getResultList(item: List<Sector>)
    }

    interface Presenter : MvpPresenter<View> {
        fun getDataFromApi()

    }
}