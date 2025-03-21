package com.springboot.learn_springboot_28minute.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyConfiguration {
    private String url;
    private String username;
    private String key;
}
