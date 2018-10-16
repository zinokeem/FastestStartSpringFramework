package org.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.spring.domain.SampleDomain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping(value = "/sample", method = {RequestMethod.GET})
    public String sample() {
        return "sample";
    }

    @RequestMapping(value = "/number", method = {RequestMethod.GET})
    @ResponseBody
    public String getRandom() {
        int number;
        Random buf = new Random();
        number = buf.nextInt(101);

        return String.valueOf(number);
    }

    @RequestMapping(value = "/postsample", method = {RequestMethod.POST})
    @ResponseBody
    public Object postSample(SampleDomain sampleDomain) {
        int number;
        Random buf = new Random();
        number = buf.nextInt(1024);

        sampleDomain.setHeader("response");
        sampleDomain.setBody(String.valueOf(number));

        List<String> list = new ArrayList<String>();
        for (int loop = 0; loop < number; loop++) {
            list.add(String.valueOf(buf.nextInt(1024)));
        }

        sampleDomain.setLog(list);
        return sampleDomain;
    }

    @RequestMapping("/showMessage")
    public String showMessage() {
        return "showMessage";
    }
}
