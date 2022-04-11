package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //	@Controller marks this class as a Spring MVC controller.
public class HomeController {

    @RequestMapping(value = "/")  //@RequestMapping flags the index() method to support the / route.
    public String index() {
        return "index";
    }

}