package com.ngelgames.h

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterfacefrfrfrrf {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJS>

    @GET("const.json")
    suspend fun getDataDev(): Response<GeoDev>
}

@Keep
data class CountryCodeJS(
    @SerializedName("city")
    val bgbbg: String,
    @SerializedName("country")
    val yhyjuj: String,
    @SerializedName("countryCode")
    val jujuj: String,
)

@Keep
data class GeoDev(
    @SerializedName("geo")
    val hyhhy: String,
    @SerializedName("view")
    val jujuu: String,
    @SerializedName("appsChecker")
    val juju: String,
)