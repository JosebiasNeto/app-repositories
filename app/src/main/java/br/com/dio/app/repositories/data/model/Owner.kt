package br.com.dio.app.repositories.data.model

import com.google.gson.annotations.SerializedName

data class Owner (
    val login: String,
    val id: Long,
    @SerializedName("avatar_url")
    val avatar_url: String
)

