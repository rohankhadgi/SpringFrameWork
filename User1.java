package com.MultiCarrier;

public class User1 {
    private Services services;

    public void setServices(Services services) {
        this.services = services;
    }

    public void serviceInfo() {
        services.serviceProvider();
        services.unlimitedCalls();
        services.unlimitedTexts();
        services.volumeData();
    }
}
