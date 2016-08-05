package com.petertackage.daggerbinds;

import dagger.Component;

/**
 * Modify which the module to test.
 * <p/>
 * 1. Using {@link GreetingModuleWithBinds} it will compile
 * 2. Using {@link GreetingModuleWithProvides} it will not compile
 */
//@Component(modules = GreetingModuleWithBinds.class)
@Component(modules = GreetingModuleWithProvides.class)
public interface GreeterComponent {

    GreetingService getGreetingService();
}
