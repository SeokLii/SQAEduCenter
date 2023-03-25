package com.ntscorp.SQAEduCenter.Controller;

import com.ntscorp.SQAEduCenter.User;
import com.ntscorp.SQAEduCenter.MongoTestRepository;
import com.ntscorp.SQAEduCenter.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class testController {
    @Autowired
    private UserRepository UserRepository;

    @RequestMapping("/test")
    public String test(Model model) {
        System.out.println(UserRepository.findByUserid("tester").getUsername());

        // html에 전송
        model.addAttribute("userid", UserRepository.findByUserid("tester").getUserid());
        model.addAttribute("username", UserRepository.findByUserid("tester").getUsername());

        System.out.println("=======");
        List<User> result = UserRepository.findAll();
        for(User user : result) {
            System.out.println(user.getUserid());
            System.out.println(user.getUsername());
        }
        System.out.println("=======");

        return "test";
    }
}
