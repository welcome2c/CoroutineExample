package dhkim.project.coroutineexample.data.repository

import dhkim.project.coroutineexample.data.GithubApi
import dhkim.project.coroutineexample.data.response.SearchResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.koin.core.qualifier.qualifier

class RepositoryImpl(private val githubApi: GithubApi): Repository {

    override fun getList(id: String, page: Int): Flow<SearchResponse> {
        return flow {
            val result = githubApi.searchUsers(id, page)
            emit(result)
        }
    }

    override fun loadMore(id: String, page: Int): Flow<List<SearchResponse.Items>> {
        return flow {
            val result = githubApi.searchUsers(id, page)
            emit(result.items)
        }
    }
}