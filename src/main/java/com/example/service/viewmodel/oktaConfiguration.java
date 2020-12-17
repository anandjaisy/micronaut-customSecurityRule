package com.example.service.viewmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.context.annotation.Property;

public class oktaConfiguration {
    @Property(name = "client-secret")
    private String clientSecret;
    @Property(name = "client-id")
    private String clientId;
    private openidConfiguration openidConfiguration;

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public com.example.service.viewmodel.openidConfiguration getOpenidConfiguration() {
        return openidConfiguration;
    }

    public void setOpenidConfiguration(com.example.service.viewmodel.openidConfiguration openidConfiguration) {
        this.openidConfiguration = openidConfiguration;
    }
}
