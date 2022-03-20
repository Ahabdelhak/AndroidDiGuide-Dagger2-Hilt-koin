package com.example.chapter03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter03.di.LoginManager
import com.example.chapter03.di.component.DaggerLoginComponent

/*
* create a simple component and module
* Dagger abstracts all heavy parts of handling the dependencies on behalf of you.
* Dagger2 uses annotation processing from the Java compiler to generate a lot of code for you,
* */
class MainActivity : AppCompatActivity() {
    private var loginManager: LoginManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginComponent = DaggerLoginComponent.create()
        loginManager =  loginComponent.getLoginManager()
        loginManager?.login("Ahmed","12222")
    }
}