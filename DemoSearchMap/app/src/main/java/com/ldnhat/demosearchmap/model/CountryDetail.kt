package com.ldnhat.demosearchmap.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CountryDetail(

    @SerializedName("id")
    val id : String? = null,

    @SerializedName("name")
    val name : String? = null,

    @SerializedName("description")
    val description : String? = null,

    @SerializedName("level")
    val level : Int? = null,

    @SerializedName("type")
    val type : String? = null,

    @SerializedName("parentId")
    val parentId : Int? = null,

    @SerializedName("code")
    val code : String? = null,

    @SerializedName("viewbox")
    val viewbox : String? = null
    ) : Parcelable