package com.petertackage.daggerbinds;

import javax.inject.Inject;

public class HelloWorldService implements GreetingService {

    @Inject
    public HelloWorldService() {
    }

    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
