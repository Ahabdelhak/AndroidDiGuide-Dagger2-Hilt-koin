package com.example.chapter03.di.component

import com.example.chapter03.di.LoginManager
import com.example.chapter03.di.module.CacheModule
import dagger.Component

/*
* Component : It is a bridge between the client and the service
* .the client is the MainActivity case, and the service is LoginManager.
* .add @Component annotation on the top of this interface and attach the cache module to the Login component in the array modules.
* */

@Component(modules = [CacheModule::class])
interface LoginComponent {
    fun getLoginManager() : LoginManager
}