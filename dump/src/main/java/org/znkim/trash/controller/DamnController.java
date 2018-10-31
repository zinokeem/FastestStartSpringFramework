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
import org.znkim.trash.domain.Damn;
import org.znkim.trash.service.DamnService;

@Controller
public class DamnController {
    @Autowired
    private DamnService damnService;

    @RequestMapping(value = "/damn", method = RequestMethod.GET)
    public String page(Locale locale, Model model) {
        model.addAttribute("status", "Connection successful.");
        return "damn";
    }

    @RequestMapping(value = "/testGet", method = RequestMethod.GET)
    @ResponseBody
    public String testGet() {
        return "Request successful.";
    }

    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    @ResponseBody
    public Object testPost(Damn damn) {
        int num = Integer.parseInt(damn.getText());
        Random ran = new Random();
        damn.setText(ran.nextInt(num) + "/" + num);
        return damn;
    }

    @RequestMapping(value = "/testService", method = RequestMethod.POST)
    @ResponseBody
    public Object testService(Damn damn) {
        ArrayList<Damn> result = damnService.selectUserData();
        return result;
    }
}
