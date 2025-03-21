package com.springboot.learn_springboot_28minute.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    private final CurrencyConfiguration currencyConfiguration;

    public CurrencyConfigurationController(CurrencyConfiguration currencyConfiguration) {
        this.currencyConfiguration = currencyConfiguration;
    }

    @RequestMapping("/currency-configurations")
    public CurrencyConfiguration getCurrencyConfiguration() {
     return currencyConfiguration;
    }

}
