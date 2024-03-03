// Generated by Dagger (https://google.github.io/dagger).
package com.example.testkotloin;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PreferenceModule_GetMyClassFactory implements Factory<MyClass> {
  private final PreferenceModule module;

  private final Provider<String> sProvider;

  public PreferenceModule_GetMyClassFactory(PreferenceModule module, Provider<String> sProvider) {
    this.module = module;
    this.sProvider = sProvider;
  }

  @Override
  public MyClass get() {
    return provideInstance(module, sProvider);
  }

  public static MyClass provideInstance(PreferenceModule module, Provider<String> sProvider) {
    return proxyGetMyClass(module, sProvider.get());
  }

  public static PreferenceModule_GetMyClassFactory create(
      PreferenceModule module, Provider<String> sProvider) {
    return new PreferenceModule_GetMyClassFactory(module, sProvider);
  }

  public static MyClass proxyGetMyClass(PreferenceModule instance, String s) {
    return Preconditions.checkNotNull(
        instance.getMyClass(s), "Cannot return null from a non-@Nullable @Provides method");
  }
}