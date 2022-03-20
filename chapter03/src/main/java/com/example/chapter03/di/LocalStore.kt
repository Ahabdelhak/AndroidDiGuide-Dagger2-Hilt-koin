package com.example.chapter03.di

import android.util.Log
import com.example.chapter03.abstractions.CacheSource
import javax.inject.Inject

class LocalStore @Inject constructor() : CacheSource {
    fun saveToken(token :String){
        Log.d("LocalStore","saveToken($token)")
    }
}
