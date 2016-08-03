package com.petertackage.daggerbinds;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class GreetingModule {

    @Binds
    public abstract GreetingService bindGreetingService(HelloWorldService helloWorldService);
}
