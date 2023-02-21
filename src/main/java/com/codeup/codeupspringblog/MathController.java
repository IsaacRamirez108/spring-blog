package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return String.format("%d plus %d gives the result of %d.", num1, num2, (num1 + num2));
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String sub(@PathVariable int num1, @PathVariable int num2) {
        return String.format("%d plus %d gives the result of %d.", num1, num2, (num1 - num2));
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multi(@PathVariable int num1, @PathVariable int num2) {
        return String.format("%d plus %d gives the result of %d.", num1, num2, (num1 * num2));
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public String div(@PathVariable int num1, @PathVariable int num2) {
        return String.format("%d plus %d gives the result of %d.", num1, num2, (num1 / num2));
    }
}
