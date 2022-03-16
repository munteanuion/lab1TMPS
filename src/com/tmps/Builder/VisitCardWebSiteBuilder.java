package com.tmps.Builder;

public class VisitCardWebSiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Visit card");
    }

    @Override
    void buildCMS() {
        webSite.setCms(CMS.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
