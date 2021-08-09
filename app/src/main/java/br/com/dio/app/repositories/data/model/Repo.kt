package br.com.dio.app.repositories.data.model

data class Repo(
    val id: Long,
    val nodeID: String,
    val name: String,
    val fullName: String,
    val private: Boolean,
    val owner: Owner,
    val htmlURL: String,
    val description: Any? = null,
    val fork: Boolean,
    val url: String,
    val size: Long,
    val stargazersCount: Long,
    val watchersCount: Long,
    val language: String
)

