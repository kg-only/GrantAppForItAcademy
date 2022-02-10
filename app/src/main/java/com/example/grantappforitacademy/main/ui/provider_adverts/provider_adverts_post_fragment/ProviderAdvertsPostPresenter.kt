package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_post_fragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProviderAdvertsPostPresenter(private val interactor: Interactor) :
    BasePresenter<ProviderAdvertsPostContract.View>(),
    ProviderAdvertsPostContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(providerAdvert: ProviderAdvert) {
        presenterScope.launch {
            try {
                interactor.postProviderAdverts(providerAdvert)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
