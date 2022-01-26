package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class ResultPoll(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("user") var user: User? = User(),
    @SerializedName("date_pass_poll") var date_pass_poll: String? = null,
    @SerializedName("avg_points") var avg_points: Int? = null,

    )