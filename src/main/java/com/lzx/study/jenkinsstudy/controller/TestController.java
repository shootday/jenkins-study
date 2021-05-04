package com.lzx.study.jenkinsstudy.controller;

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

    @RequestMapping("/")
    public String test() {
        return "hello";
    }
}
