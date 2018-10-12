package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sampleController {

    @RequestMapping("/sample")
    public String sample() {
        return "sample";
    }

    @RequestMapping("/showMessage")
    public String showMessage() {
        return "showMessage";
    }
}
