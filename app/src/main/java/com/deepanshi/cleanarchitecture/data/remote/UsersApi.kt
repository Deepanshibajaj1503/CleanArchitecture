package com.deepanshi.cleanarchitecture.data.remote

import com.deepanshi.cleanarchitecture.data.remote.dto.UsersDTO
import retrofit2.http.GET

interface UsersApi {

    @GET("/users")
    suspend fun getUsers(): List<UsersDTO>
}