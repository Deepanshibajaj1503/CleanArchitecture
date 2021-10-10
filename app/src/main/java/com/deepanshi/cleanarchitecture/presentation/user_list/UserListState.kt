package com.deepanshi.cleanarchitecture.presentation.user_list

import com.deepanshi.cleanarchitecture.domain.model.User


data class UserListState(
    val isLoading: Boolean = false,
    val users: List<User> = emptyList(),
    val error: String = ""
)
