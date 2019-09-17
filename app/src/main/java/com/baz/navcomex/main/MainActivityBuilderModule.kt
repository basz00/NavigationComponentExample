package com.baz.navcomex.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class MainActivityBuilderModule {

    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity
}