package com.example.grantappforitacademy.main.ui.write_us

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.WriteUs

interface WriteUsContract {
    interface View : MvpView {
//         fun getResultList(item: List<Grant>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(writeUs: WriteUs)

    }
}