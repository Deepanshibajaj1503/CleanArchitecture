package com.deepanshi.cleanarchitecture.presentation

sealed class Screen(val route: String) {
    object UserListScreen: Screen("user_list_screen")
}
