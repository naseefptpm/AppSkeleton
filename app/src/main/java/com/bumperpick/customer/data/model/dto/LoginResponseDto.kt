package com.bumperpick.customer.data.model.dto

data class LoginResponseDto(
    val userId: Int,
    val name: String,
    val email: String,
    val token: String
)
