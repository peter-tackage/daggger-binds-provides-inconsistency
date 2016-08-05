package com.petertackage.daggerbinds;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class GreetingModuleWithBinds {

    /**
     * When using @Binds, no error is generated even if there is no way to resolve an {@link AnotherGreetingService}.
     * It will just use what ever instance it can, in this case {@link HelloWorldGreetingService}.
     */

    @Binds
    public abstract GreetingService bindGreetingService(HelloWorldGreetingService helloWorldGreetingService);

    @Binds
    public abstract GreetingService bindAnotherGreetingService(AnotherGreetingService anotherGreetingService);

    @Provides
    public static Displayer provideDisplayer(SystemDisplayer systemLogger) {
        return systemLogger;
    }

}
