package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView

interface BusinessAdvertsCommentContract {
    interface View : MvpView {
//         fun getResultList(item: List<BusinessAdvertComment>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi()

    }
}