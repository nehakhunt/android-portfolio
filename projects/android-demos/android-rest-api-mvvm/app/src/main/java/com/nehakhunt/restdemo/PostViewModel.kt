package com.nehakhunt.restdemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PostViewModel(private val repository: PostRepository = PostRepository()) : ViewModel() {
    private val _state = MutableStateFlow(ApiState<List<Post>>())
    val state: StateFlow<ApiState<List<Post>>> = _state

    fun loadPosts() { viewModelScope.launch { _state.value = ApiState(loading = true); runCatching { repository.getPosts() }.onSuccess { _state.value = ApiState(data = it) }.onFailure { _state.value = ApiState(error = it.message ?: "Network error") } } }
}
