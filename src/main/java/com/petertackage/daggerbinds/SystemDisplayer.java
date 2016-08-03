package com.petertackage.daggerbinds;

public class SystemDisplayer implements Displayer {
    @Override
    public void display(String text) {
        System.out.println(text);
    }
}
