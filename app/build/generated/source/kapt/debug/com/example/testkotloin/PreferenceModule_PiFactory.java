// Generated by Dagger (https://google.github.io/dagger).
package com.example.testkotloin;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class PreferenceModule_PiFactory implements Factory<InjectClass> {
  private final PreferenceModule module;

  public PreferenceModule_PiFactory(PreferenceModule module) {
    this.module = module;
  }

  @Override
  public InjectClass get() {
    return provideInstance(module);
  }

  public static InjectClass provideInstance(PreferenceModule module) {
    return proxyPi(module);
  }

  public static PreferenceModule_PiFactory create(PreferenceModule module) {
    return new PreferenceModule_PiFactory(module);
  }

  public static InjectClass proxyPi(PreferenceModule instance) {
    return Preconditions.checkNotNull(
        instance.pi(), "Cannot return null from a non-@Nullable @Provides method");
  }
}