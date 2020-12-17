package com.example.service.viewmodel;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("oauth2")
public class oauth2ConfigurationViewModel {
    private clientsConfiguration clientsConfiguration;

    public com.example.service.viewmodel.clientsConfiguration getClientsConfiguration() {
        return clientsConfiguration;
    }

    public void setClientsConfiguration(com.example.service.viewmodel.clientsConfiguration clientsConfiguration) {
        this.clientsConfiguration = clientsConfiguration;
    }
}
