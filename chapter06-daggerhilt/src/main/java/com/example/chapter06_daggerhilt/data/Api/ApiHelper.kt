package com.example.chapter06_daggerhilt.data.Api

import com.example.chapter06_daggerhilt.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}
