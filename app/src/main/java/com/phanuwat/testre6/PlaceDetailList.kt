package com.phanuwat.testre6

import com.google.gson.annotations.SerializedName

data class PlaceDetailList (
    @SerializedName("from") val from: getPlaceDetail,
    @SerializedName("to") val to: getPlaceDetail,
    @SerializedName("parking_from") val parkingFrom: getPlaceDetail,
    @SerializedName("parking_to") val parkingTo: getPlaceDetail,
    @SerializedName("price") val price: getPlaceDetail,
    @SerializedName("drivers_phones_number") val phoneNum: getPlaceDetail,
    @SerializedName("vans_plate") val IdPlates: getPlaceDetail


)