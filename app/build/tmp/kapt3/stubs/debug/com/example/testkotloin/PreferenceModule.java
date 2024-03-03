package com.example.testkotloin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0006H\u0007J\u0018\u0010\u0012\u001a\n \u0013*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/testkotloin/PreferenceModule;", "", "()V", "getMyClass", "Lcom/example/testkotloin/MyClass;", "s", "", "me", "", "pi", "Lcom/example/testkotloin/InjectClass;", "provideAwesomeManager", "Lcom/example/testkotloin/AwesomeManager;", "c", "provideAwesomeManager2", "Lcom/example/testkotloin/A;", "Landroid/content/Context;", "provideMyClass", "provideUserContext", "kotlin.jvm.PlatformType", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public final class PreferenceModule {
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context provideUserContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.testkotloin.InjectClass pi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.testkotloin.AwesomeManager provideAwesomeManager(@org.jetbrains.annotations.NotNull()
    com.example.testkotloin.InjectClass c) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.testkotloin.A provideAwesomeManager2(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideMyClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.testkotloin.MyClass getMyClass(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final int me() {
        return 0;
    }
    
    public PreferenceModule() {
        super();
    }
}