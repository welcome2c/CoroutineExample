package dhkim.project.coroutineexample.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dhkim.project.coroutineexample.data.repository.Repository
import dhkim.project.coroutineexample.data.response.SearchResponse
import dhkim.project.coroutineexample.view.BaseViewModel

class MainViewModel(val repository: Repository) : BaseViewModel() {
    private val _userList = MutableLiveData<MutableList<Any>>()
    val userList: LiveData<MutableList<Any>>
        get() = _userList

}