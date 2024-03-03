package com.example.testkotloin

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        //AndroidSupportInjectionModule::class,
        PreferenceModule::class,
        ActivityModule::class,
        AppModule::class,
        //ถ้าใใช้ @ContributesAndroidInjector(modules = [FragmentModule::class]) ใน ActivityModule ก็ไม่ต้องใส่บรรทัดข้างล่าง
        //FragmentModule::class,
        M2::class
    ])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
    fun inject(myApp: MyApp)
    //fun inject(activity: MainActivity)
}