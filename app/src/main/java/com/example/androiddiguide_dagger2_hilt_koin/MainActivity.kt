package com.example.androiddiguide_dagger2_hilt_koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * Repo Contains 5 modules for DI and Dagger Implementation
        * 1- IoC containers, create dependencies manually (without any Frameworks or additional libraries)
        * 2-pure Dependency Injection , App Container
        * 3-create a simple component and module
        * 4-Field Injection, Method Injection.
        * 5-@Binds , @Provide
        * */


        /*
        * What Is Dependency Injection(DI)?
        * In software engineering, dependency injection is a technique in which an object receives other objects that it depends on.
        * These other objects are called dependencies. In the typical "using" relationship, the receiving object is called a client,
        *  and the passed (that is, "injected") object is called a service.
        * The code that passes the service to the client can be many things and is called the injector.
        * Instead of the client specifying which service it will use,
        * the injector tells the client what service to use.
        * The "injection" refers to the passing of a dependency (a service) into the object (a client) that would use it.
        **/


        /*
        * Why Do We Need DI?
        If you ● implement the DI, you will gain the following advantages:
        * Resolve the tight coupling between components
        * Reuse some components and modules
        * Optimize the heap memory using scopes
        * Architect your app into separated components
        * Facilitate the unit testing by mocking the objects
        * Testing Upper components are independent of the lower components.
        * Replace the dependency with various Implementations easily.
        *
        * */


        /*
        * The Types of DI
            ● Constructor Injection
            ● Filed Injection
            ● Method Injection
        * */
    }
}