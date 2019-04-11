package com.phanuwat.testre6

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("total_count")
    val totalCount : Long
)