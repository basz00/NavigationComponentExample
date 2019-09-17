package com.baz.navcomex.injection

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class AppModule {

    @Provides
    @Singleton
    fun providesDummyDependency(): DummyDependency {
        return object : DummyDependency {}
    }
}