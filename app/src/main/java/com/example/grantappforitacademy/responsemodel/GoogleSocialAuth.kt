package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class GoogleSocialAuth(
    @SerializedName("auth_token")
    var auth_token: String? = null,
    @SerializedName("user_type")
    var user_type: String? = null,
)
