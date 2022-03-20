package com.example.chapter05.di

import android.util.Log
import javax.inject.Inject

class LoginManager @Inject constructor(private val localStore: LocalStore,private val apiService: LoginService){
    fun login(username : String , pass:String){
        Log.d("LoginManager","login($username , $pass)")
        val token = apiService.authenticate(username,pass)
        localStore.saveToken(token)
    }

    //Method Injection
    @Inject
    fun enableCache(config: Config){
        Log.d("LoginManger","${config.isCacheEnabled}")
        config.enableCache(this)
    }
}