package com.petertackage.daggerbinds;

public class AnotherGreetingService implements GreetingService {

    // No @Injects here! So no way for Dagger to know how to create an instance.

    @Override
    public String getGreeting() {
        return "Another greeting";
    }
}
