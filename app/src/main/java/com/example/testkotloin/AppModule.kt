package com.example.testkotloin

import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun me2():Float = 1003.0f

    class Info3 @Inject constructor(val n:Int ) {
        var number = n
        init {
            System.out.println("-------Info3 numer= "+number)
        }
    }
    /*@Singleton
    @Provides
    fun me3():Float = 1001.0f*/
}