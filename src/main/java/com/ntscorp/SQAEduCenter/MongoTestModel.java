package com.ntscorp.SQAEduCenter;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class MongoTestModel {

    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}