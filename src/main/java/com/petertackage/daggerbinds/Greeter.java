package com.petertackage.daggerbinds;

import javax.inject.Inject;

public class Greeter {

    private final GreetingService greetingService;

    @Inject
    public Greeter(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void greet() {
        System.out.println(this.greetingService.getGreeting());
    }
}
