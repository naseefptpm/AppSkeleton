package com.bumperpick.customer.data.service

import com.bumperpick.customer.data.model.dto.LoginRequestDto
import com.bumperpick.customer.data.model.dto.LoginResponseDto
import com.bumperpick.customer.data.model.dto.SignUpRequestDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequestDto): LoginResponseDto

    @POST("auth/signup")
    suspend fun signUp(@Body request: SignUpRequestDto): LoginResponseDto
}