package com.example.grantappforitacademy.interactor

import com.example.grantappforitacademy.main.api.RetrofitService
import com.example.grantappforitacademy.responsemodel.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class InteractorTestClass(private val api: RetrofitService) : InteractorTest {

    override suspend fun getEventRequest(method: String): List<Event> =
        withContext(Dispatchers.IO) {
            return@withContext api.getEvent(method)
        }

    override suspend fun getEventCommentRequest(): List<EventComment> =
        withContext(Dispatchers.IO) {
            return@withContext api.getEventComment()
        }

    override suspend fun getGrantRequest(method: String): List<Grant> =
        withContext(Dispatchers.IO) {
            return@withContext api.getGrant(method)
        }

    override suspend fun postEventCommentRequest(eventCommentPost:EventCommentPost) =
        withContext(Dispatchers.IO) {
            return@withContext api.postEventComment(eventCommentPost)
        }
}