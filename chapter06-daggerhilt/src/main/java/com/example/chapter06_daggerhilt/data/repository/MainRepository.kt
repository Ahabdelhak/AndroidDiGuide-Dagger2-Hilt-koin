package com.example.chapter06_daggerhilt.data.repository

import com.example.chapter06_daggerhilt.data.Api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}
