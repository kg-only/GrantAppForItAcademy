package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class UserPoll(
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("email")
    var email: String? = null,
)