package com.baidu.monitor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloSpringMVC {

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

    @RequestMapping("/hello5")
    public void HelloWorld5(){
   	    System.out.println("HelloWorld55555");
        System.out.println("HelloWorld55555");
//        model.addAttribute("message","Hello World!!!HelloWorld55555");
//        return "hello";
   } 
}
