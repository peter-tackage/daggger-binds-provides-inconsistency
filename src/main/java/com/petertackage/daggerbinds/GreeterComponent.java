package com.petertackage.daggerbinds;

import dagger.Component;

@Component(modules = GreetingModule.class)
public interface GreeterComponent {

    GreetingService getGreetingService();
}
