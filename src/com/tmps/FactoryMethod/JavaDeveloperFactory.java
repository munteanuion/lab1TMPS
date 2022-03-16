package com.tmps.FactoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory{
    public Developer CreateDeveloper(){
        return new JavaDeveloper();
    }
}
