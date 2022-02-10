package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_fragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProviderAdvertsPresenter(private val interactor: Interactor) :
    BasePresenter<ProviderAdvertsContract.View>(),
    ProviderAdvertsContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override suspend fun getDataFromApi() {
        presenterScope.launch {
            try {
                val data = interactor.getProviderAdverts()
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
