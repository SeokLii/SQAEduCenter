package com.ntscorp.SQAEduCenter.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ntscorp.SQAEduCenter.Model.MongoTestModel;
import com.ntscorp.SQAEduCenter.Repository.MongoTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MongoTestService {
    @Autowired
    MongoTestRepository mongoTestRepository;

    public String selectUser(String name) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            if (mongoTestRepository.findByName(name) == null) {
                System.out.println("[Service] user name : {} not exist!!" + name);
                return String.format("user name : %s not exist!!", name);
            } else {
                return objectMapper.writeValueAsString(mongoTestRepository.findByName(name));
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "ERROR";
        }
    }

    public void saveUser(String name, int age) {

        MongoTestModel mongoTestModel = new MongoTestModel();
        mongoTestModel.setName(name);
        mongoTestModel.setAge(age);

        if (mongoTestRepository.findByName(name) != null) {
            System.out.println("[Service][update] name is already exist!!");
            mongoTestModel.setId(mongoTestRepository.findByName(name).getId());
        } else {
            System.out.println("[Service][insert] New name received!!");
        }

        mongoTestRepository.save(mongoTestModel);
    }

}
