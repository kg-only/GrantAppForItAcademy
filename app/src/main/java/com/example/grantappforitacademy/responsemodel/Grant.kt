package com.example.grantappforitacademy.responsemodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Grant(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("sum") var sum: Int? = null,
    @SerializedName("currency") var currency: String? = null,
    @SerializedName("deadline") var deadline: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("location") var location: String? = null,
    @SerializedName("period") var period: String? = null,
    @SerializedName("logo") var logo: String? = null,
    @SerializedName("image") var image: String? = null,
    @SerializedName("created_at") var createdAt: String? = null,
    @SerializedName("comments") var comments: ArrayList<GrantComment> = arrayListOf(),

    ) : Parcelable