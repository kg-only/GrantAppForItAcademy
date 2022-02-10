package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName
import de.hdodenhof.circleimageview.CircleImageView

data class UserBusinessProfile(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("email") var email: String? = null,
    @SerializedName("first_name") var firstName: String? = null,
    @SerializedName("last_name") var lastName: String? = null,
    @SerializedName("password") var password: String? = null,
    @SerializedName("password2") var password2: String? = null,
    @SerializedName("birth_date") var birthDate: String? = null,
    @SerializedName("gender") var gender: String? = null,
    @SerializedName("country") var country: String? = null,
    @SerializedName("city") var city: String? = null,
    @SerializedName("phone") var phone: String? = null,
    @SerializedName("telegram") var telegram: String? = null,
    @SerializedName("avatar") var avatar: String? = null,
    @SerializedName("site") var site: String? = null,
    @SerializedName("is_premium") var isPremium: Boolean? = null,
    @SerializedName("start_date") var startDate: String? = null,
    @SerializedName("end_date") var endDate: String? = null,
    @SerializedName("is_business") var isBusiness: Boolean? = null,
    @SerializedName("is_provider") var isProvider: Boolean? = null,

    )