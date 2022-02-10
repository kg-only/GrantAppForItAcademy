package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BusinessAdvertsPresenter(private val interactor: Interactor) :
    BasePresenter<BusinessAdvertsContract.View>(),
    BusinessAdvertsContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi() {
        presenterScope.launch {
            try {
                val data = interactor.getBusinessAdverts()
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
