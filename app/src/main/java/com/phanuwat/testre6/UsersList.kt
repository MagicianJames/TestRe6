package com.phanuwat.testre6

import com.google.gson.annotations.SerializedName

data class UsersList (
//        @SerializedName("items") val users: List<User>,
//        @SerializedName("total_count") val total: Int
    @SerializedName("items") val items: User,
    @SerializedName("documentation_url") val total: Int
)