package com.ntscorp.SQAEduCenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mongo")
public class MongoTestController {

    @Autowired
    MongoTestService mongoDBTestService;

    @GetMapping(value = "/find")
    public String findUserData(@RequestParam String name) {
        return mongoDBTestService.selectUser(name);
    }

    @GetMapping(value = "/save")
    public String saveUserData(@RequestParam String name, @RequestParam int age) {
        System.out.println("[Controller][Recv] name : {}, age : {}" + name + age);
        mongoDBTestService.saveUser(name, age);

        return mongoDBTestService.selectUser(name);
    }
}
