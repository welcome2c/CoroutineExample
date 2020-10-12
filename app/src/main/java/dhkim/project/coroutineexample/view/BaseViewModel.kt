package dhkim.project.coroutineexample.view

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel

open class BaseViewModel : ViewModel() {
    val scope: CoroutineScope ?= null

    override fun onCleared() {
        super.onCleared()
        scope?.cancel()
    }
}