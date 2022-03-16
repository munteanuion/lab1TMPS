package com.tmps.AbstractFactory.LandingProject;

import com.tmps.AbstractFactory.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void WriteCode() {
        System.out.println("PHP Developer writes code for Landing Page Project.");
    }
}
