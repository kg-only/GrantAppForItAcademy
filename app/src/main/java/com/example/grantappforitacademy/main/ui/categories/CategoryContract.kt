package com.example.grantappforitacademy.main.ui.categories

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.BlogPost

interface CategoryContract {
    interface View : MvpView {
         fun getResultList(data: List<BlogPost>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi()
    }
}