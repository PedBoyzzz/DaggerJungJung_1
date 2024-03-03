// Generated by Dagger (https://google.github.io/dagger).
package com.example.testkotloin;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class Info2_Factory implements Factory<Info2> {
  private final Provider<String> nProvider;

  public Info2_Factory(Provider<String> nProvider) {
    this.nProvider = nProvider;
  }

  @Override
  public Info2 get() {
    return provideInstance(nProvider);
  }

  public static Info2 provideInstance(Provider<String> nProvider) {
    return new Info2(nProvider.get());
  }

  public static Info2_Factory create(Provider<String> nProvider) {
    return new Info2_Factory(nProvider);
  }

  public static Info2 newInfo2(String n) {
    return new Info2(n);
  }
}