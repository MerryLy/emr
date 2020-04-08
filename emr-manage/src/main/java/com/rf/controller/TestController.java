package com.rf.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private final Logger logger = LogManager.getLogger(this.getClass());

    @RequestMapping(value = "/")
    String home() {
        logger.info("Welcome to the new world!");
        return "Welcome to the new world!";
    }
}
