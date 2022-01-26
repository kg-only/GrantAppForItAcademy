package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class WriteUs(

@SerializedName("id")
var id: Int? = null,
@SerializedName("full_name")
var fullName: String? = null,
@SerializedName("phone")
var phone: String? = null,
@SerializedName("email")
var email: String? = null,
@SerializedName("message")
var message: String? = null

)