package com.oocl.ParkingLotApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan Wei
 * @date 2018-07-30 17:08
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHelloWorld(){
        return "欢迎使用one percent小组宇宙超级劲爆无敌强大的停车场系统！";
    }

}
