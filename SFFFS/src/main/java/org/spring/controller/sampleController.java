package org.spring.controller;

import java.util.Random;

import org.spring.domain.sampleDomain;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sampleController {

    @RequestMapping(value = "/sample", method = {RequestMethod.GET})
    public String sample() {
        return "sample";
    }

    @RequestMapping(value = "/number", method = {RequestMethod.GET})
    @ResponseBody
    public String getRandom() {
        int number;
        Random buf = new Random();
        number = buf.nextInt(100);

        sampleDomain domain = new sampleDomain();
        domain.setHeader("THIS IS HEADER.");

        return String.valueOf(number);
    }

    @RequestMapping("/showMessage")
    public String showMessage() {
        return "showMessage";
    }
}
