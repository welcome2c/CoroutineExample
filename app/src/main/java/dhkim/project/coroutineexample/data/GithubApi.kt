package dhkim.project.coroutineexample.data

import dhkim.project.coroutineexample.data.response.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApi {

    @GET("/users")
    suspend fun searchUsers(
        @Query("q") id: String,
        @Query("page") page: Int,
    ) : SearchResponse

    companion object {
        const val BASE_URL = "https://api.github.com"
    }
}