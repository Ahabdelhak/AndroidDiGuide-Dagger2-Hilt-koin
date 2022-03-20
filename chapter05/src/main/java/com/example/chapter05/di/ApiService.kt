package com.example.chapter05.di

interface ApiService {
    fun authenticate(username:String , password:String)  : String
}
