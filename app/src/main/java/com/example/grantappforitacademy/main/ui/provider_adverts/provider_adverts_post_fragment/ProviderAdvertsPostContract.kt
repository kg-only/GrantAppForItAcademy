package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_post_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Grant
import com.example.grantappforitacademy.responsemodel.ProviderAdvert

interface ProviderAdvertsPostContract {
    interface View : MvpView {

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(providerAdvert: ProviderAdvert)

    }
}