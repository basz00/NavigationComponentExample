package com.baz.navcomex.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class MainFragmentBuilderModule {

    @ContributesAndroidInjector
    internal abstract fun mainFragment(): MainFragment
}