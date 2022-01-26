package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class AdvertCategory(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("description") var description: String? = null,
)