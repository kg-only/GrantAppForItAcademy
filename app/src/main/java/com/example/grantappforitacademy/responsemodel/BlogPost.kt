package com.example.grantappforitacademy.responsemodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BlogPost(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("subtitle") var subtitle: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("created") var created: String? = null,
    @SerializedName("post_image") var postImage: String? = null,
    @SerializedName("comments") var comments: List<BlogComment> = arrayListOf()

    ) :Parcelable