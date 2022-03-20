package com.example.chapter04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter04.di.Config
import com.example.chapter04.di.LoginManager
import com.example.chapter04.di.component.DaggerLoginComponent
import javax.inject.Inject

/*
* Field Injection is beneficial in some situations,
* like when we deal with third-party classes and do not own them like Picasso, Okhttp, or classes that implement some interface.
* */

/*
*Method Injection it is very helpful in some scenarios,
*  like when we need to enable caching for our login manager.
*  Let’s assume we have a Config class responsible for allowing and Disabling all features in your App like enable/disable caching
* */
class MainActivity : AppCompatActivity() {
    //Field Inject
    @Inject lateinit var loginManager: LoginManager
    @Inject lateinit var config: Config
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // using dagger component (Field Inject)
        val loginComponent = DaggerLoginComponent.create()
        loginComponent.inject(this)
        loginManager.login("ramadan","12222")
        //Method Injection
        loginManager.enableCache(config)
    }
}