package com.rf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description:
 * date: 2020/3/29 14:58
 * email: meili@111.com.cn
 * author: MeiLi
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String toLogin() {
        return "login";
    }
}
