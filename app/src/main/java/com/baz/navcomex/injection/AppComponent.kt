package com.baz.navcomex.injection

import com.baz.navcomex.Application
import com.baz.navcomex.first.FirstFragmentBuilderModule
import com.baz.navcomex.login.LoginFragmentBuilderModule
import com.baz.navcomex.login.RegisterFragmentBuilderModule
import com.baz.navcomex.main.MainActivityBuilderModule
import com.baz.navcomex.main.MainFragmentBuilderModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        AppModule::class,
        MainActivityBuilderModule::class,
        LoginFragmentBuilderModule::class,
        RegisterFragmentBuilderModule::class,
        MainFragmentBuilderModule::class,
        FirstFragmentBuilderModule::class]
)
internal interface AppComponent : AndroidInjector<Application> {

    @Component.Factory
    abstract class Builder : AndroidInjector.Factory<Application>
}