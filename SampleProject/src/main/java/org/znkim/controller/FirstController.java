package org.znkim.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.znkim.domain.First;
import org.znkim.service.FirstService;

@Controller
@RequestMapping("first")
public class FirstController {

    @Autowired
    FirstService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(First param) {
        return "first";
    }

    @RequestMapping(value = "main", method = RequestMethod.POST)
    @ResponseBody
    public Object postTrans(First param) {
        List<First> result = new ArrayList();
        result = service.selectUserData();
        return result;
    }
}
