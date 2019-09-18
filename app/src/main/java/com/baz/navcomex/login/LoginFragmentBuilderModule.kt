package com.baz.navcomex.login

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class LoginFragmentBuilderModule {

    @ContributesAndroidInjector
    internal abstract fun loginFragment(): LoginFragment
}