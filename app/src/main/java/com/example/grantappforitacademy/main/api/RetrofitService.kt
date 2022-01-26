package com.example.grantappforitacademy.main.api

import com.example.grantappforitacademy.responsemodel.*
import retrofit2.http.*

interface RetrofitService {
    @GET("{method}")
    suspend fun getEvent(@Path("method") method: String): List<Event>

    @GET("{method}")
    suspend fun getGrant(@Path("method") method: String): List<Grant>


    @POST("events/comments/create_comment")
    suspend fun postEventComment(@Body eventCommentPost: EventCommentPost)

    @GET("events/comments")
    suspend fun getEventComment(): List<EventComment>

}