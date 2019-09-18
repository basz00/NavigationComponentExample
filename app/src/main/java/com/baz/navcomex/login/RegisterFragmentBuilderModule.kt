package com.baz.navcomex.login

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class RegisterFragmentBuilderModule {

    @ContributesAndroidInjector
    internal abstract fun registerFragment(): RegisterFragment
}