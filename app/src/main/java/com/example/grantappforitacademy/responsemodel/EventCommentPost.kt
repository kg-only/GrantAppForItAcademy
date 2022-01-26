package com.example.grantappforitacademy.responsemodel

import android.os.Parcelable
import android.text.Editable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class EventCommentPost(
    @SerializedName("post") var post: Int? = null,
    @SerializedName("text") var text: String? = null,
    @SerializedName("user") var user: User? = User(),
) :Parcelable
