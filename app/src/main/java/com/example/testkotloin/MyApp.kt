package com.example.testkotloin

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject


class MyApp: Application(),HasActivityInjector{
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }
    override fun onCreate() {
        super.onCreate()

        AppInjector.init(this)
        System.out.println("----------create app")
        // เดี๋ยวจะใส่คำสั่งของ Dagger 2 ไว้ที่นี่
    }
}