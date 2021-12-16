package com.example.controller;

import com.example.anntation.MyAnnotationSwagger3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("helloWord")
    public   String  helloWord(String  name){
        return "hello word !!";
    }
    @PostMapping("hello")
    public  String  helloName(String  name){
        return "hello "+name+"!";
    }
    @RequestMapping("bayJan")
    public  String   bayJan(String  name,String  sex){
        return  "bay  jan !";
    }
}
