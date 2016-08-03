package com.petertackage.daggerbinds;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class GreetingModule {

    @Binds
    public abstract GreetingService bindGreetingService(HelloWorldGreetingService helloWorldGreetingService);

    @Provides
    public static Displayer provideDisplayer(SystemDisplayer systemLogger) {
        return systemLogger;
    }

}
