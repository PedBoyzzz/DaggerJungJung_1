package com.example.testkotloin

import javax.inject.Inject

class AwesomeManager2 @Inject constructor(val a:UserPreference) {
    init {
        System.out.println("---- i am AwesomeManager2")
    }
}