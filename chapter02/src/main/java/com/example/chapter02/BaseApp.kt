package com.example.chapter02

import android.app.Application
import com.example.chaper01.di.LoginManager
import com.example.chapter02.container.AppContainer

class BaseApp : Application(){
    val loginManager : LoginManager by lazy {
        AppContainer().getLoginManager()
    }
}