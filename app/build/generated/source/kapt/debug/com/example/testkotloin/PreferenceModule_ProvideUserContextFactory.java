// Generated by Dagger (https://google.github.io/dagger).
package com.example.testkotloin;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PreferenceModule_ProvideUserContextFactory implements Factory<Context> {
  private final PreferenceModule module;

  private final Provider<Application> applicationProvider;

  public PreferenceModule_ProvideUserContextFactory(
      PreferenceModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return provideInstance(module, applicationProvider);
  }

  public static Context provideInstance(
      PreferenceModule module, Provider<Application> applicationProvider) {
    return proxyProvideUserContext(module, applicationProvider.get());
  }

  public static PreferenceModule_ProvideUserContextFactory create(
      PreferenceModule module, Provider<Application> applicationProvider) {
    return new PreferenceModule_ProvideUserContextFactory(module, applicationProvider);
  }

  public static Context proxyProvideUserContext(
      PreferenceModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideUserContext(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
