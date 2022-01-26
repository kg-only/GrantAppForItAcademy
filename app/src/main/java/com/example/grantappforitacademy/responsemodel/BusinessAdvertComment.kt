package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class BusinessAdvertComment(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("post") var post: Int? = null,
    @SerializedName("text") var text: Int? = null,
    @SerializedName("user") var user: User? = User(),
    @SerializedName("posted") var posted: Int? = null,
)
