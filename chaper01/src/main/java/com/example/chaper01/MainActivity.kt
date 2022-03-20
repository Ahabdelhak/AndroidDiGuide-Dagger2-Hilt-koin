package com.example.chaper01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaper01.di.ApiService
import com.example.chaper01.di.LocalStore
import com.example.chaper01.di.LoginManager

/*
* IoC containers
* create dependencies manually
* Constructor Injection without any Frameworks or additional libraries
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create dependencies manually
        val cacheSource = LocalStore("Bearer khhdjhhudyucdjhd.....");
        val apiSource = ApiService("Ahmed" ,"123");
        val loginManager =  LoginManager(cacheSource,apiSource)
    }
}