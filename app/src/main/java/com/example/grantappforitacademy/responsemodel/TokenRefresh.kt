package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class TokenRefresh(
    @SerializedName("refresh")
    var refresh: String? = null,
)