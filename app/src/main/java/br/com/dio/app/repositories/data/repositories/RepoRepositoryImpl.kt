package br.com.dio.app.repositories.data.repositories

import android.os.RemoteException
import br.com.dio.app.repositories.data.model.Repo
import br.com.dio.app.repositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String)= flow {
        try{
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException){
            throw br.com.dio.app.repositories.core.RemoteException(ex.message ?: "Não foi possivel fazer a busca no momento.")
        }

    }
}