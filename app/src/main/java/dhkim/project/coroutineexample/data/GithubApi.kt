package dhkim.project.coroutineexample.data

import dhkim.project.coroutineexample.data.response.SearchResponse
import retrofit2.http.GET

interface GithubApi {

    @GET("/users")
    suspend fun searchUsers(

    ) : SearchResponse

    companion object {
        const val BASE_URL = "https://api.github.com"
    }
}