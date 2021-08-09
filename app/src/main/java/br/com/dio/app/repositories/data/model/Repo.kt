package br.com.dio.app.repositories.data.model

import com.google.gson.annotations.SerializedName

data class Repo(
    val id: Long,
    val nodeID: String,
    val name: String,
    @SerializedName("full_name")
    val fullName: String,
    val private: Boolean,
    val owner: Owner,
    @SerializedName("html_url")
    val htmlURL: String,
    val description: Any? = null,
    val fork: Boolean,
    val url: String,
    val size: Long,
    @SerializedName("stargazers_count")
    val stargazersCount: Long,
    val watchersCount: Long,
    val language: String
)

