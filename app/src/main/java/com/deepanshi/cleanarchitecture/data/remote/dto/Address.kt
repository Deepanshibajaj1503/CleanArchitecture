package com.deepanshi.cleanarchitecture.data.remote.dto

data class Address(
    val city: String,
    val geo: Geo,
    val street: String,
    val suite: String,
    val zipcode: String
)