package com.example.laba1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")// "/" - говорит о том, что при переходе на гланую страничку будет вызваться функция ниже
    // "home" - название шаблона
    // "title" - название странички
    public String home() {
        return "Home";
    }
}