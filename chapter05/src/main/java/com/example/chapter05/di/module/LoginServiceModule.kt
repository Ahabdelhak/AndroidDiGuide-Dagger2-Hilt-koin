package com.example.chapter05.di.module

import com.example.chapter05.di.ApiService
import com.example.chapter05.di.LoginService
import dagger.Binds
import dagger.Module

@Module
abstract class LoginServiceModule {
    @Binds
    abstract fun  bindLoginService(loginService: LoginService) : ApiService
}
