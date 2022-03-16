package com.tmps.Builder;

public abstract class WebSiteBuilder {
    WebSite webSite;

    void CreateWebSite(){
            webSite = new WebSite();
        }

    abstract void buildName();
    abstract void buildCMS();
    abstract void buildPrice();

    WebSite getWebSite(){
        return webSite;
    }
}
