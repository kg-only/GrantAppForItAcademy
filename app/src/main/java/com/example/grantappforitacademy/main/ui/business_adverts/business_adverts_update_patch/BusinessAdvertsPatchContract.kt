package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_update_patch

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.BusinessAdvertPost

interface BusinessAdvertsPatchContract {
    interface View : MvpView {
//         fun getResultList(item: List<Event>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(id:Int,businessAdvertPost: BusinessAdvertPost)

    }
}