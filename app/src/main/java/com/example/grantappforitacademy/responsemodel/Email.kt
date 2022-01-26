package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class Email(
    @SerializedName("email")
    var email: String? = null,
)