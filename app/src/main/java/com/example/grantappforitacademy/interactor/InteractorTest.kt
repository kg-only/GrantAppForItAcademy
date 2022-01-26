package com.example.grantappforitacademy.interactor

import com.example.grantappforitacademy.responsemodel.*

interface InteractorTest {
    suspend fun getEventRequest(method: String) : List<Event>
    suspend fun getEventCommentRequest() : List<EventComment>
    suspend fun getGrantRequest(method: String) : List<Grant>
    suspend fun postEventCommentRequest(eventCommentPost:EventCommentPost)
}