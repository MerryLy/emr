package com.rf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * date: 2020/3/29 14:58
 * email: meili@111.com.cn
 * author: MeiLi
 */
@RestController
public class TestController {

    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }
}
