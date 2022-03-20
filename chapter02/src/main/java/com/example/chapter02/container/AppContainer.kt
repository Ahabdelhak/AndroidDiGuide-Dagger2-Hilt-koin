package com.example.chapter02.container

import com.example.chaper01.di.ApiService
import com.example.chaper01.di.LocalStore
import com.example.chaper01.di.LoginManager

class AppContainer {
    fun getLoginManager():LoginManager {
        val cacheSource = LocalStore("Bearer khhdjhhudyucdjhd.....")
        val apiSource = ApiService("Ahmed" ,"123")
        return LoginManager(cacheSource, apiSource)
    }
}