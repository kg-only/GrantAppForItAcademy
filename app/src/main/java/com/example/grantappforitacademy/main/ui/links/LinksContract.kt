package com.example.grantappforitacademy.main.ui.links

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Links

interface LinksContract {
    interface View : MvpView {
         fun getResultList(item: List<Links>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi()

    }
}