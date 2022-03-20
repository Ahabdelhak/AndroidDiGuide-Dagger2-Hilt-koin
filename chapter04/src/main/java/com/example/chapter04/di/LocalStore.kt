package com.example.chapter04.di

import android.util.Log
import com.example.chapter04.abstractions.CacheSource
import javax.inject.Inject

class LocalStore @Inject constructor() : CacheSource {
    fun saveToken(token :String){
        Log.d("LocalStore","saveToken($token)")
    }
}
