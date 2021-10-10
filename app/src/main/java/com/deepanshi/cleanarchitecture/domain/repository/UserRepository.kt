package com.deepanshi.cleanarchitecture.domain.repository

import com.deepanshi.cleanarchitecture.data.remote.dto.UsersDTO

interface UserRepository {

    suspend fun getUsers(): List<UsersDTO>
}