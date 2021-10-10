package com.deepanshi.cleanarchitecture.data.remote.dto

import com.deepanshi.cleanarchitecture.domain.model.User

data class UsersDTO(
    val address: Address,
    val company: Company,
    val email: String,
    val id: Int,
    val name: String,
    val phone: String,
    val username: String,
    val website: String
)

fun UsersDTO.toUser(): User {
    return User(
        id = id,
        name = name,
        username = username,
        email = email
    )
}