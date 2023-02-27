package com.codeup.codeupspringblog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String landingPage() {
        return "index";
    }

    @GetMapping("/roll-dice")
    @ResponseBody
    public String Roll() {
        return "index";
    }
}
