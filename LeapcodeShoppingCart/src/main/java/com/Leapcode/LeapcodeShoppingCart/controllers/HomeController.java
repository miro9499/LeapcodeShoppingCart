package com.Leapcode.LeapcodeShoppingCart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";//去做mapping 去template找对应的html
    }
}
