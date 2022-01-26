package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class ProviderAdvertComment(
    @SerializedName("id"     ) var id     : Int?    = null,
    @SerializedName("post"   ) var post   : Int?    = null,
    @SerializedName("text"   ) var text   : String? = null,
    @SerializedName("user"   ) var user   : User?   = User(),
    @SerializedName("posted" ) var posted : String? = null

)