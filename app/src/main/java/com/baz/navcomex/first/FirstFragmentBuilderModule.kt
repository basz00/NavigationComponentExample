package com.baz.navcomex.first

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class FirstFragmentBuilderModule {

    @ContributesAndroidInjector
    internal abstract fun firstFragment(): FirstFragment
}