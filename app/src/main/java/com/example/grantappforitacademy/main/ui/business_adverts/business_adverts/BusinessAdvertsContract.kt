package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.BusinessAdvert

interface BusinessAdvertsContract {
    interface View : MvpView {
         fun getResultList(item: List<BusinessAdvert>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi()

    }
}