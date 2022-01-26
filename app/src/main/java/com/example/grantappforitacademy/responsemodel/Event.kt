package com.example.grantappforitacademy.responsemodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Event(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("date") var date: String? = null,
    @SerializedName("time") var time: String? = null,
    @SerializedName("location") var location: String? = null,
    @SerializedName("event_format") var eventFormat: String? = null,
    @SerializedName("sum") var sum: Int? = null,
    @SerializedName("event_image") var eventImage: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("comments") var comments: ArrayList<EventComment> = arrayListOf(),
) : Parcelable