// Generated by Dagger (https://google.github.io/dagger).
package com.example.testkotloin;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

public final class ViewModelFactory2_Factory implements Factory<ViewModelFactory2> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider;

  public ViewModelFactory2_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    this.creatorsProvider = creatorsProvider;
  }

  @Override
  public ViewModelFactory2 get() {
    return provideInstance(creatorsProvider);
  }

  public static ViewModelFactory2 provideInstance(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    return new ViewModelFactory2(creatorsProvider.get());
  }

  public static ViewModelFactory2_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    return new ViewModelFactory2_Factory(creatorsProvider);
  }

  public static ViewModelFactory2 newViewModelFactory2(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> creators) {
    return new ViewModelFactory2(creators);
  }
}