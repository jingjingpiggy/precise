package com.baidu.monitor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringDaily {

    @GetMapping("/hello")
    public String hello() {
//        model.addAttribute("message","Hello World!!!test");
        System.out.println("hello");
        return "hello";
    }
    @GetMapping("/hello2")
    public String hello2(){
        System.out.println("hello2");
        return "hello2";
    }
    @GetMapping("/hello1")
    public String hello1(){
        System.out.println("hello1");
        return "hello1";
    }
    @GetMapping("/hello6")
    public String HelloWorld6(){
   	    System.out.println("HelloWorld6");
//        model.addAttribute("message","Hello World!!!HelloWorld55555");
//        return "hello";
        return "HelloWorld6";
   }
    @GetMapping("/hello7")
    public String HelloWorld7(){
        System.out.println("HelloWorld7");
//        model.addAttribute("message","Hello World!!!HelloWorld55555");
//        return "hello";
        return "HelloWorld7";
    }

    @GetMapping("/hello8")
    public String HelloWorld8(){
        System.out.println("HelloWorld8");
//        model.addAttribute("message","Hello World!!!HelloWorld55555");
//        return "hello";
        return "HelloWorld8";
    }

    @GetMapping("/hello9")
    public String HelloWorld9(){
        System.out.println("HelloWorld9");
//        model.addAttribute("message","Hello World!!!HelloWorld55555");
//        return "hello";
        return "HelloWorld9";
    }
}
