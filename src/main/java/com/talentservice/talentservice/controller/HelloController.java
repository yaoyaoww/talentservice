package com.talentservice.talentservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lmy on 2018/3/7.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET, headers = "Accept=application/json")
    public String hello(){

        return "hello 吕梦瑶";
    }
}
