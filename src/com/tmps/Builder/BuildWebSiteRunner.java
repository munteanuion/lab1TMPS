package com.tmps.Builder;

public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebSiteBuilder());
        WebSite webSite = director.buildWebSite();

        System.out.println(webSite);
    }
}
