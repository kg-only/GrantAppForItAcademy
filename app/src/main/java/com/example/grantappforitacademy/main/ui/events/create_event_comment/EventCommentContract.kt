package com.example.grantappforitacademy.main.ui.events.create_event_comment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.EventComment
import com.example.grantappforitacademy.responsemodel.EventCommentPost

interface EventCommentContract {
    interface View : MvpView {
         fun getResultList(data: List<EventComment>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(eventCommentPost:EventCommentPost)

    }
}