package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class Method(
    @SerializedName("name")
    var name: String? = null,
)