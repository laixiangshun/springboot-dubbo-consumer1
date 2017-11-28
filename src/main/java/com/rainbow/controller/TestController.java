package com.rainbow.controller;

import com.rainbow.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lailai on 2017/11/28.
 */
@RestController
public class TestController {

//    @Reference(version = "1.0.0")
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
//    @ResponseBody
    public String test(){
        return testService.sayHello("rainbow");
    }
}
