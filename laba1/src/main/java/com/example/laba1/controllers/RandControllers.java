package com.example.laba1.controllers;

import com.example.laba1.exceptions.InputException;
import com.example.laba1.parametrs.Impulse;
import com.example.laba1.validator.Validator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RandControllers {
    @GetMapping("/Laba1")
    public String main(Model model) {
        Impulse test = new Impulse();
        model.addAttribute("message");
        return "Laba1";
    }

    @PostMapping("/Laba1")
    public String processMain(@RequestParam String inputmass1, String inputmass2, String inputspeed1, String inputspeed2, Model model) {
        Validator validator = new Validator();
        try {
            validator.CheckString(inputmass1, inputmass2, inputspeed1, inputspeed2);
            int mass1 = Integer.parseInt(inputmass1);//делает из строки int
            int mass2 = Integer.parseInt(inputmass2);
            int speed1 = Integer.parseInt(inputspeed1);
            int speed2 = Integer.parseInt(inputspeed2);
            Impulse test = new Impulse();
            test.setMass1(mass1);
            test.setMass2(mass2);
            test.setSpeed1(speed1);
            test.setSpeed2(speed2);
            model.addAttribute("message", "Ответ: " + test.Calculate());
        }
        catch (InputException ex) {
            model.addAttribute("message", ex.getMessage());
        }
        return "Laba1";
    }
}
