package com.example.grantappforitacademy.main.ui.unsubscribe

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.Contacts
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UnSubscribePresenter(private val interactor: Interactor) :
    BasePresenter<UnSubscribeContract.View>(),
    UnSubscribeContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(email: String) {
        presenterScope.launch {
            try {
                interactor.deleteSubscribe(email)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
