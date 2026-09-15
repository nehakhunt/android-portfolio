package com.nehakhunt.restdemo

import retrofit2.http.GET

interface PostApi { @GET("posts") suspend fun getPosts(): List<Post> }

object ApiClient {
    val api: PostApi = retrofit2.Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
        .build().create(PostApi::class.java)
}
