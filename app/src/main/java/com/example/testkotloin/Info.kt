package com.example.testkotloin

import javax.inject.Inject
import javax.inject.Singleton
//@Singleton
class Info @Inject constructor(val n:Int) {
    var number = n
    init {
        //System.out.println("-------my numner haha= "+number)
    }
}