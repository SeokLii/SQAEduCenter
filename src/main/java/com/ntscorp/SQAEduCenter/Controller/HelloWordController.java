package com.ntscorp.SQAEduCenter.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @GetMapping("/api/hello")
    public String test(){
        return "Hello, world";
    }
}
