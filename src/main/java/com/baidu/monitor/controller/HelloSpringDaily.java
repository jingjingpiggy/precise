package com.baidu.monitor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloSpringDaily {

    @RequestMapping("/hello")
    public void hello() {
//        model.addAttribute("message","Hello World!!!test");
        System.out.println("hello");
    }
    @RequestMapping("/hello2")
    public void hello2(){
        System.out.println("hello2");
    }
    @RequestMapping("/hello1")
    public void hello1(){
    	 System.out.println("hello1");
    }

    @RequestMapping("/hello6")
    public void HelloWorld6(){
   	    System.out.println("HelloWorld6");
//        model.addAttribute("message","Hello World!!!HelloWorld55555");
//        return "hello";
   }
    @RequestMapping("/hello7")
    public void HelloWorld7(){
        System.out.println("HelloWorld7");
//        model.addAttribute("message","Hello World!!!HelloWorld55555");
//        return "hello";
    }

}
