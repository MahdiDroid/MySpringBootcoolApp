package com.mehdi.SpringBootDemo.MycoolApp.Contoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {


    @GetMapping("/")
    public String sayHello(){
        return "hello : time is : " + LocalDateTime.now();
    }
}
