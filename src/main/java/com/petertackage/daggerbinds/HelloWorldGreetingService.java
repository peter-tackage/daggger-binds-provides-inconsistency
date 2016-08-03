package com.petertackage.daggerbinds;

import javax.inject.Inject;

public class HelloWorldGreetingService implements GreetingService {

    @Inject
    public HelloWorldGreetingService() {
    }

    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
