package com.codeup.codeupspringblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/add/{a}/and/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return String.valueOf(a + b);
    }

    @GetMapping("/subtract/{a}/from/{b}")
    public String subtract(@PathVariable int a, @PathVariable int b) {
        return String.valueOf(b - a);
    }

    @GetMapping("/multiply/{a}/and/{b}")
    public String multiply(@PathVariable int a, @PathVariable int b) {
        return String.valueOf( a * b);
    }

    @GetMapping("/divide/{a}/by/{b}")
    public String divide(@PathVariable int a, @PathVariable int b) {
        if (b == 0) {
            return "Number cannot be divisible by 0";
        }
        return String.valueOf((double) a / b);
    }

}
