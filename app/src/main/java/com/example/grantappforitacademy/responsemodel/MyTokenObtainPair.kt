package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class MyTokenObtainPair(
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("password")
    var password: String? = null,
)