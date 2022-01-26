package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class Contacts(
    @SerializedName("email")
    var email: String? = null
)