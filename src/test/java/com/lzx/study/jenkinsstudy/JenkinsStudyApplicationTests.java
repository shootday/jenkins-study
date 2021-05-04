package com.lzx.study.jenkinsstudy;

import com.lzx.study.jenkinsstudy.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsStudyApplicationTests {


    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {
        int add = testService.add(2, 3);
        assert add == 5;
        System.out.println("呵呵呵");
    }

}
