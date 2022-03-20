package com.example.chaper01.di

import com.example.chaper01.abstractions.CacheSource

//Bad Approach

//class LoginManager (username:String, password:String, token :String){
//    val localStore  = LocalStore(token)
//    val apiService = ApiService(username , password)
//}

//Good Design
class LoginManager (val localStore: CacheSource, val apiService: ApiService)