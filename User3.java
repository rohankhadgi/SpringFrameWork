package com.MultiCarrier;

public class User3 {
    private Services services;

    public void setServices(Services services) {
        this.services = services;
    }

    public void serviceInfo() {
        services.serviceProvider();
        services.unlimitedCalls();
        services.unlimitedTexts();
        services.unlimitedData();
    }
}
