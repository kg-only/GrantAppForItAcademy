package com.example.grantappforitacademy.main.ui.eventsfragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.InteractorTestClass
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EventPresenter(private val interactor: InteractorTestClass) :
    BasePresenter<EventContract.View>(),
    EventContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override suspend fun getDataFromApi(method: String) {
        presenterScope.launch {
            try {
                val data = interactor.getEventRequest(method)
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
