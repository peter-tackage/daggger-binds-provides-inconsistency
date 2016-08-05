package com.petertackage.daggerbinds;

import dagger.Module;
import dagger.Provides;

@Module
public class GreetingModuleWithProvides {

    /**
     * When using @Provides, even if there is no way to resolve an {@link AnotherGreetingService}
     * instance. Dagger still reports an error to indicate you are trying to provide two {@link GreetingService}
     * instances.
     */

    @Provides
    public GreetingService bindGreetingService(HelloWorldGreetingService helloWorldGreetingService) {
        return helloWorldGreetingService;
    }

    @Provides
    public GreetingService bindAnotherGreetingService(AnotherGreetingService anotherGreetingService) {
        return anotherGreetingService;
    }

    @Provides
    public static Displayer provideDisplayer(SystemDisplayer systemLogger) {
        return systemLogger;
    }

}
