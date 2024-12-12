package com.amar.config.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Configuration
@ConfigurationProperties(prefix = "pizza")

@NoArgsConstructor
@AllArgsConstructor
public class PizzaConfig {

    private String crust;
    private String topping;
    private String sauce;

    public String getCrust() {
        return crust;
    }

    public String getTopping() {
        return topping;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
}
