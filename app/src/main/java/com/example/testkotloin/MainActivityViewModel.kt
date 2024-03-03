package com.example.testkotloin

import javax.inject.Inject

class MainActivityViewModel @Inject constructor(val f:Float) {
    init {
        System.out.println("----------init view model "+f)
    }
}