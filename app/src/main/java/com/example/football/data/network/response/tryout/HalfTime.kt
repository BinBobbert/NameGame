package com.example.football.data.network.response.tryout


import com.google.gson.annotations.SerializedName

data class HalfTime(
    @SerializedName("awayTeam")
    val awayTeam: Any?,
    @SerializedName("homeTeam")
    val homeTeam: Any?
)