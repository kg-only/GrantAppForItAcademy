package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Grant
import com.example.grantappforitacademy.responsemodel.ProviderAdvert

interface ProviderAdvertsContract {
    interface View : MvpView {
         fun getResultList(item: List<ProviderAdvert>)

    }

    interface Presenter : MvpPresenter<View> {
        suspend fun getDataFromApi()

    }
}