package com.example.chapter05.di.module

import com.example.chapter05.abstractions.CacheSource
import com.example.chapter05.di.LocalStore
import dagger.Module
import dagger.Provides

@Module
class LocalStoreModule {
    @Provides
    fun provideLocalStore() = LocalStore()
}
