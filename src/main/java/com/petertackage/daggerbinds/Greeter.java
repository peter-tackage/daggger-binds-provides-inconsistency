package com.petertackage.daggerbinds;

import javax.inject.Inject;

public class Greeter {

    private final GreetingService greetingService;
    private final Displayer displayer;

    @Inject
    public Greeter(GreetingService greetingService,
                   Displayer displayer) {
        this.greetingService = greetingService;
        this.displayer = displayer;
    }

    public void greet() {
        this.displayer.display(this.greetingService.getGreeting());
    }
}
