package com.lzx.study.jenkinsstudy.controller;

import com.lzx.study.jenkinsstudy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: jenkins-study
 * @Date: 2021/5/4 11:00
 * @Author: lzx
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public String test() {
        return "hello";
    }


    @RequestMapping("/add")
    public int aad() {
       return testService.add(1, 2);
    }
}
