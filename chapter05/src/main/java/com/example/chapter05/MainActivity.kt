package com.example.chapter05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter05.di.Config
import com.example.chapter05.di.LoginManager
import com.example.chapter05.di.component.DaggerLoginComponent
import javax.inject.Inject

/*
*from a performance perspective insted of using @Provide use @Binds annotation
**/

/*
* @Binds methods are just a method declaration,
*  they are expressed as abstract methods — no implementation is ever created and nothing is ever invoked.
*  On the other hand, a @Provides method does have an implementation and will be invoked.
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