package com.tmps.AbstractFactory.Banking;

import com.tmps.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void WriteCode() {
        System.out.println("Java Developer writes code for Banking Project.");
    }
}
