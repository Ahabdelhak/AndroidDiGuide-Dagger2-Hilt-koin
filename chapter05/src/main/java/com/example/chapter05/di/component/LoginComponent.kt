package com.example.chapter05.di.component

import com.example.chapter05.MainActivity
import com.example.chapter05.di.module.LocalStoreModule
import com.example.chapter05.di.module.LoginServiceModule
import dagger.Component

/*
* Component : It is a bridge between the client and the service
* */


@Component(modules = [LocalStoreModule::class , LoginServiceModule::class])
interface LoginComponent {
    fun inject(activity: MainActivity)
}
