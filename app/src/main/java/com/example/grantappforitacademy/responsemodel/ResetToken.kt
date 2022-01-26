package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class ResetToken(
@SerializedName("token")
var token: String? = null
)