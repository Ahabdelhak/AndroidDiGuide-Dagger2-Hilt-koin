package com.example.chapter04.di.component

import com.example.chapter04.MainActivity
import com.example.chapter04.di.module.CacheModule
import dagger.Component

/*
* Component : It is a bridge between the client and the service
* */

/*
* Field Injection is beneficial in some situations,
* like when we deal with third-party classes and do not own them like Picasso, Okhttp, or classes that implement some interface.
* */

/*
* This method will be responsible for injecting LoginManager Instance in the MainActivity.kt by using MainActivity_MembersInjector class
* */
@Component(modules = [CacheModule::class])
interface LoginComponent {
    //Field Injection
    fun inject(activity: MainActivity)
}