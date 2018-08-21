package com.jll.resource;

import com.jll.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class AppController {

    private static final String template = "Hello, %s";

    @GetMapping("/greeting")
    @ResponseBody
    public Greeting getGreeting(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        return new Greeting(new Random().nextLong(), String.format(template, name));
    }

}