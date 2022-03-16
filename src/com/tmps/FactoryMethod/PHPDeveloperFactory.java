package com.tmps.FactoryMethod;

public class PHPDeveloperFactory implements DeveloperFactory{
    public Developer CreateDeveloper(){
        return new JavaDeveloper();
    }
}
