package com.example.chapter05.di

import android.util.Log
import javax.inject.Inject

/*
* Method Injection and it is very helpful in some scenarios,
*  like when we need to enable caching for our login manager.
*  Let’s assume we have a Config class responsible for allowing and Disabling all features in your App like enable/disable caching
* */
class Config @Inject constructor() {
    var isCacheEnabled = false
    fun enableCache(loginManager: LoginManager){
        isCacheEnabled = true
        Log.d("config","${this.isCacheEnabled}")
    }
}
