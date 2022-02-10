package com.example.grantappforitacademy.responsemodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BusinessAdvert(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("price") var price: String? = null,
    @SerializedName("currency") var currency: String? = null,
    @SerializedName("completed") var completed: String? = null,
    @SerializedName("user") var user: Int? = null,
    @SerializedName("needs") var needs: String? = null,
    @SerializedName("suggest") var suggest: String? = null,
    @SerializedName("tel") var tel: String? = null,
    @SerializedName("created_at") var created_at: String? = null,
    @SerializedName("days") var days: Int? = null,
    @SerializedName("comments") var comment: List<BusinessAdvertComment> = arrayListOf(),
) :Parcelable
