package com.example.testkotloin

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
//จะInject ผ่าน fun Provide หรือ Inject Class Contractor ก็ได้
@Module
class M2 {
    @Singleton
    @Provides
    fun provideUserPreference(application: Application) =
        UserPreference(application.applicationContext)

    //ถ้า Inject Class Contractor ก็ไม่ต้องสร้าง ด้านล่าง
    /*@Singleton
    @Provides
    fun provideAwesomeManager2(userPreference: UserPreference) =
        AwesomeManager2(userPreference)*/

    /*@Singleton
    @Provides
    fun provideViewModel(n:Float):MainActivityViewModel{
        System.out.println("------- view model n = "+n)
        val m = MainActivityViewModel()
        return m
    }*/
}