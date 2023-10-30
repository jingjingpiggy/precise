package com.baidu.monitor.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/test")
public class HelloSpringMaster {
    @GetMapping(value = "/hello3", produces = "application/json;charset=UTF-8")
    public void test() {
        System.out.println("test3");
//        return new MonitorResponse<String>().success();
    }
    @GetMapping(value = "/hello4", produces = "application/json;charset=UTF-8")
    public void HelloWorld(Model model){
        System.out.println("test4");
    }
}
