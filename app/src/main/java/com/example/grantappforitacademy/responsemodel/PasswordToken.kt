package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class PasswordToken(
    @SerializedName("password")
    var password: String? = null,
    @SerializedName("token")
    var token: String? = null,
)