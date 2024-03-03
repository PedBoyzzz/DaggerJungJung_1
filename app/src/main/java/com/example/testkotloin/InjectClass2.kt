package com.example.testkotloin

import android.app.Application
import android.content.Context
import javax.inject.Inject

class InjectClass2 @Inject constructor(a:InjectClass?) {
    init {
        System.out.println("---------init InjectClass2")
    }
}