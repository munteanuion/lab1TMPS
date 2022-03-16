package com.tmps.Builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder){
        this.builder = builder;
    }

    WebSite buildWebSite(){
        builder.CreateWebSite();
        builder.buildName();
        builder.buildCMS();
        builder.buildPrice();

        WebSite webSite = builder.getWebSite();

        return webSite;
    }
}
