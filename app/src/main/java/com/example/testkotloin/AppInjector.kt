package com.example.testkotloin

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector

//import dagger.android.support.HasSupportFragmentInjector

object AppInjector {
    fun init(awesomeApp: MyApp) {
        System.out.println("----AppInjector init")
        DaggerAppComponent.builder()
            .application(awesomeApp)
            .build().inject(awesomeApp)
        awesomeApp.registerActivityLifecycleCallbacks(object :
            Application.ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                System.out.println("----onActivityCreated")
                handleActivity(activity)
            }
            override fun onActivityStarted(activity: Activity) {
                System.out.println("----onActivityStarted")
            }
            override fun onActivityResumed(activity: Activity) {
            }
            override fun onActivityPaused(activity: Activity) {
            }
            override fun onActivityStopped(activity: Activity) {
            }
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                System.out.println("----- onActivitySaveInstanceState")
            }
            override fun onActivityDestroyed(activity: Activity) {
            }
        })
    }
    private fun handleActivity(activity: Activity) {
        if (activity is HasSupportFragmentInjector) {
            AndroidInjection.inject(activity)
        }
        if (activity is FragmentActivity) {
            activity.supportFragmentManager
                .registerFragmentLifecycleCallbacks(
                    object : FragmentManager.FragmentLifecycleCallbacks() {
                        override fun onFragmentCreated(
                            fm: FragmentManager,
                            f: Fragment,
                            savedInstanceState: Bundle?
                        ) {
                            if (f is Injectable) {
                                System.out.println("-----Injectable")
                                AndroidSupportInjection.inject(f)
                            }else{
                                System.out.println("-----not Injectable")
                            }
                        }
                    }, true
                )
        }
    }
}