package com.ntscorp.SQAEduCenter;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MongoTestRepository extends MongoRepository<MongoTestModel, String> {
    MongoTestModel findByName(String name);
}