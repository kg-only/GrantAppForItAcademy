package com.example.grantappforitacademy.main.ui.createeventcomment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.InteractorTestClass
import com.example.grantappforitacademy.responsemodel.EventCommentPost
import com.example.grantappforitacademy.responsemodel.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EventCommentPresenter(private val interactor: InteractorTestClass) :
    BasePresenter<EventCommentContract.View>(),
    EventCommentContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(eventCommentPost : EventCommentPost) {
        presenterScope.launch {
            try {
                interactor.postEventCommentRequest(eventCommentPost)
                val data = interactor.getEventCommentRequest()
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
