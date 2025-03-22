package com.springboot.learn_springboot_28minute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

        @GetMapping("/login")
        public String loginMessage() {
            return "login";
        }
}
