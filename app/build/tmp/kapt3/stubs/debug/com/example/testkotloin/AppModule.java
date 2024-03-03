package com.example.testkotloin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/example/testkotloin/AppModule;", "", "()V", "me2", "", "Info3", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final float me2() {
        return 0.0F;
    }
    
    public AppModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\u0004\u00a8\u0006\n"}, d2 = {"Lcom/example/testkotloin/AppModule$Info3;", "", "n", "", "(I)V", "getN", "()I", "number", "getNumber", "setNumber", "app_debug"})
    public static final class Info3 {
        private int number;
        private final int n = 0;
        
        public final int getNumber() {
            return 0;
        }
        
        public final void setNumber(int p0) {
        }
        
        public final int getN() {
            return 0;
        }
        
        @javax.inject.Inject()
        public Info3(int n) {
            super();
        }
    }
}