package com.tmps.Builder;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprise website");
    }

    @Override
    void buildCMS() {
        webSite.setCms(CMS.OPENCART);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(5000);
    }
}
