package com.example.grantappforitacademy.responsemodel

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("category" ) var category : String? = null,
    @SerializedName("ru_link"  ) var ruLink   : String? = null,
    @SerializedName("kg_link"  ) var kgLink   : String? = null
)