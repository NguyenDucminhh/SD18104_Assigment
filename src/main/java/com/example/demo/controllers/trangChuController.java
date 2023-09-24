package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class trangChuController {
    @GetMapping("home-page")
    public String trangChu()
    {
        return "trangChu/homepage";
    }

}
