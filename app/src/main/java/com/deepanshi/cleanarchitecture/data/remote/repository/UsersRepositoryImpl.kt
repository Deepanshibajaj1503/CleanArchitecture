package com.deepanshi.cleanarchitecture.data.remote.repository

import com.deepanshi.cleanarchitecture.data.remote.UsersApi
import com.deepanshi.cleanarchitecture.data.remote.dto.UsersDTO
import com.deepanshi.cleanarchitecture.domain.repository.UserRepository
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(
    private val api: UsersApi
) : UserRepository {

    override suspend fun getUsers(): List<UsersDTO> {
        return api.getUsers()
    }

}