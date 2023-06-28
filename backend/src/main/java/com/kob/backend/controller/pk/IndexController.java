package com.kob.backend.controller.pk;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("index/")
    public String index() {
        return "pk/index.html";
    }


    @RequestMapping("getinfo/")
    public String getInfo() {
        String a = "aaa";
        String b = "bbb";
        List<String> list = new LinkedList<>();
        list.add(a);
        list.add(b);
        return a;
    }
}
