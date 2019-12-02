package com.medialink.deco2myintent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PersonExperimental (
    val name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
) : Parcelable