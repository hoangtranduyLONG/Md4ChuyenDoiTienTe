package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverter {
    @GetMapping()
    public String index() {
        return "index";
    }

    @GetMapping("/converter")
    public String converter(@RequestParam String usd, Model model) {
        float rs = Float.parseFloat(usd) * 23000;
        model.addAttribute("rs", rs);
        return "result";
    }


}
