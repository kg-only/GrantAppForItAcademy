package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class ChangePassword(
    @SerializedName("old_password") var old_password: String? = null,
    @SerializedName("new_password") var new_password: String? = null,
)