package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class BlogPost(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("subtitle") var subtitle: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("created") var created: String? = null,
    @SerializedName("post_image") var postImage: String? = null,
    @SerializedName("comments") var comments: BlogComment = BlogComment()

    )