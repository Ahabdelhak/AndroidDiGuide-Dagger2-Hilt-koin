package com.example.chapter02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
* pure Dependency Injection
* app container
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // pure Dependency Injection
        val loginManager = (application as BaseApp).loginManager
        loginManager.print()

    }
}