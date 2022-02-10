package com.example.grantappforitacademy.main.ui.subscribe

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.Contacts
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SubscribePresenter(private val interactor: Interactor) :
    BasePresenter<SubscribeContract.View>(),
    SubscribeContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(contacts: Contacts) {
        presenterScope.launch {
            try {
                interactor.postSubscribe(contacts)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
