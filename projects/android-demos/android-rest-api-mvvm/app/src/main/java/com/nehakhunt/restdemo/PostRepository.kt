package com.nehakhunt.restdemo

class PostRepository(private val api: PostApi = ApiClient.api) { suspend fun getPosts(): List<Post> = api.getPosts() }
