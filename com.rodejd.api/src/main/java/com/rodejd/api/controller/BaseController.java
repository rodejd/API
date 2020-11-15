package com.rodejd.api.controller;


import com.rodejd.api.res.MemberRes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BaseController {

    @GetMapping("/hello")
    public String Hello(){

        return "hello";

    }


}
