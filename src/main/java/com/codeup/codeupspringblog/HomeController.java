package com.codeup.codeupspringblog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    // Lecture Examples
//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello World!";
//    }
//
//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name) {
//        return "Hello " + name + "!";
//    }
//
//    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOne(@PathVariable int number) {
//        return number + " plus one is " + (number + 1) + "!";
//    }

    // Exercises
    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "This is the landing page!";
    }
}
