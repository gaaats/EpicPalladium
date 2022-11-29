package com.ngelgames.h.gogogogo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlin.random.Random

@Parcelize
data class SingleUserrrrrr(
    val id: Int = Random.nextInt(from = 1, until = 10000),
    val name: String
) : Parcelable {
    val listNames = listOf("sasha", "masha", "roma", "denis", "eva", "nastya", "kolya", "john", "noname", "rembo", "frodo", "gimli")
}
