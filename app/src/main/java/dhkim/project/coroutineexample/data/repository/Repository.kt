package dhkim.project.coroutineexample.data.repository

import dhkim.project.coroutineexample.data.response.SearchResponse
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getList(id: String, page: Int) : Flow<SearchResponse>
    fun loadMore(id: String, page: Int) : Flow<SearchResponse.Items>
}