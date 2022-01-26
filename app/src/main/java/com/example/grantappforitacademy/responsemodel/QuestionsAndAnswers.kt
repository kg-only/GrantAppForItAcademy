package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class QuestionsAndAnswers(
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("question")
    var question: String? = null,
    @SerializedName("answer")
    var answer: String? = null,
)