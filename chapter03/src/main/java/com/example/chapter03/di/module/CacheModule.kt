package com.example.chapter03.di.module

import com.example.chapter03.abstractions.CacheSource
import com.example.chapter03.di.LocalStore
import dagger.Module
import dagger.Provides

/*
* Local Store implements interface and interfaces can not be constructed. So I have to use the module to solve this issue
* */
/*
* annotate this class with @Module annotation.
* After that, you make a method to provide an instance from LocalStore as a cache source type using @Provides annotation.
* */
@Module
class CacheModule {
    @Provides
    fun provideCacheSource(localStore: LocalStore) : CacheSource{
        return localStore
    }
}