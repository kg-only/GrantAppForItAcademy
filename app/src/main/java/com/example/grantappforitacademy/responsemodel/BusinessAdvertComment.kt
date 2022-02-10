package com.example.grantappforitacademy.responsemodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BusinessAdvertComment(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("post") var post: Int? = null,
    @SerializedName("text") var text: String? = null,
    @SerializedName("user") var user: User? = User(),
    @SerializedName("posted") var posted: String? = null,
) :Parcelable
