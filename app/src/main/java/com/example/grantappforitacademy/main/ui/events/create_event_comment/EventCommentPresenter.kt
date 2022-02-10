package com.example.grantappforitacademy.main.ui.events.create_event_comment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.EventCommentPost
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EventCommentPresenter(private val interactor: Interactor) :
    BasePresenter<EventCommentContract.View>(),
    EventCommentContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(eventCommentPost : EventCommentPost) {
        presenterScope.launch {
            try {
                interactor.postEventCreateComment(eventCommentPost)
                val data = interactor.getEventComment()
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
