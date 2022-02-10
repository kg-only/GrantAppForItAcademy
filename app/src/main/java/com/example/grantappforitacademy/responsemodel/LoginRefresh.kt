package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class LoginRefresh(
    @SerializedName("refresh")
    var refresh: String? = null,
)