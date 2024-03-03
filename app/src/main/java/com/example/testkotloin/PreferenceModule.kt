package com.example.testkotloin

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
//จะInject ผ่าน fun Provide หรือ Inject Class Contractor ก็ได้
@Module
class PreferenceModule{

    @Singleton
    @Provides
    fun provideUserContext(application: Application) =
        application.applicationContext

    /*@Singleton
    @Provides
    fun provideUserPreference(application: Application) =
        UserPreference(application.applicationContext)*/
    /*@Singleton
    @Provides
    fun provideAwesomeManager2(userPreference: UserPreference) =
        AwesomeManager2(userPreference)*/

    @Singleton
    @Provides
    fun pi() = InjectClass()
    /*@Singleton
    @Provides
    fun p2(c:InjectClass) = InjectClass2(c)*/
    @Singleton
    @Provides
    fun provideAwesomeManager(c: InjectClass) =
        AwesomeManager(c)


    /*@Provides
    @Singleton
    fun provideAppContext(application:Application): Context = application.applicationContext*/
    @Singleton
    @Provides
    fun provideAwesomeManager2(c: Context) =
        A(c)
    /*@Singleton
    @Provides
    fun provideAwesomeManager(userPreference: UserPreference) =
        AwesomeManager(userPreference)*/

    @Singleton
    @Provides
    fun provideMyClass():String = String(StringBuffer("HHHHH"))
    /*@Singleton
    @Provides
    fun provideMyClass():String{
        val s = String(StringBuffer("HHHHH"))
        return s
    }*/
    @Singleton
    @Provides
    fun getMyClass(s: String):MyClass{
        var c = MyClass()
        //c.name = s
        return c
    }

    /*@Singleton
    @Provides
    fun provideInt():Int = 1000000*/
    @Singleton
    @Provides
    fun me():Int = 1000
}