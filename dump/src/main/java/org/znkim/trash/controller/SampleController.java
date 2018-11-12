package org.znkim.trash.controller;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.znkim.trash.domain.Sample;
import org.znkim.trash.service.SampleService;

@Controller
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String page(Locale locale, Model model) {
        model.addAttribute("status", "Connection successful.");
        return "sample";
    }

    @RequestMapping(value = "/testGet", method = RequestMethod.GET)
    @ResponseBody
    public String testGet() {
        return "Request successful.";
    }

    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    @ResponseBody
    public Object testPost(Sample sample) {
        int num = Integer.parseInt(sample.getText());
        Random ran = new Random();
        sample.setText(ran.nextInt(num) + "/" + num);
        return sample;
    }

    @RequestMapping(value = "/testService", method = RequestMethod.POST)
    @ResponseBody
    public Object testService(Sample sample) {
        ArrayList<Sample> result = sampleService.selectUserData();
        return result;
    }
}
