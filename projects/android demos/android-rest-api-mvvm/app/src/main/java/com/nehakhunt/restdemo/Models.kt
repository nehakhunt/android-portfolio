package com.nehakhunt.restdemo

data class Post(val id: Int, val title: String, val body: String)

data class ApiState<out T>(val loading: Boolean = false, val data: T? = null, val error: String? = null)
