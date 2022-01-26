package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class UpdateUser(
    @SerializedName("email") var email: String? = null,
    @SerializedName("first_name") var first_name: String? = null,
    @SerializedName("last_name") var last_name: String? = null,
    @SerializedName("birth_date") var birth_date: String? = null,
    @SerializedName("gender") var gender: String? = null,
    @SerializedName("country") var country: String? = null,
    @SerializedName("city") var city: String? = null,
    @SerializedName("phone") var phone: String? = null,
    @SerializedName("telegram") var telegram: String? = null,
    @SerializedName("avatar") var avatar: String? = null,
    @SerializedName("site") var site: String? = null,
)