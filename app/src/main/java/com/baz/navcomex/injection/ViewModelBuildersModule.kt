package com.baz.navcomex.injection

import androidx.lifecycle.ViewModelProvider
import com.baz.navcomex.injection.CustomViewModelFactory
import dagger.Binds
import dagger.Module

@Module
internal abstract class ViewModelBuildersModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: CustomViewModelFactory): ViewModelProvider.Factory
}