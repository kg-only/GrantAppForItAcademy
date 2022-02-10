package com.example.grantappforitacademy.responsemodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProviderAdvert(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("image") var image: String? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("price") var price: String? = null,
    @SerializedName("currency") var currency: String? = null,
    @SerializedName("tel") var tel: String? = null,
    @SerializedName("location") var location: String? = null,
    @SerializedName("created_at") var createdAt: String? = null,
    @SerializedName("days") var days: Int? = null,
    @SerializedName("user") var user: Int? = null,
    @SerializedName("comments") var comments: List<ProviderAdvertComment> = arrayListOf(),
):Parcelable