package com.example.testkotloin

import javax.inject.Inject
import javax.inject.Singleton
//@Singleton
class Info2 @Inject constructor(val n:String) {
    var number = n
    init {
        //System.out.println("-------my numner haha Float= "+number)
    }
}