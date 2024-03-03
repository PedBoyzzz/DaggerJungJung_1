package com.example.testkotloin

import javax.inject.Inject

class AwesomeManager  constructor(val a:InjectClass) {
    init {
        System.out.println("---- i am AwesomeManager")
    }
}