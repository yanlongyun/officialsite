package com.zrzhen.officialsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 慧燕
 * @date: 2020/10/5 11:59
 * @copyright yanlongyun2020
 */
@Controller
public class IndexController {

    @RequestMapping("")
    public String index() {
        return "index";
    }
}
