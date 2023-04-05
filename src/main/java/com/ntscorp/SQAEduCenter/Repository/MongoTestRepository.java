package com.ntscorp.SQAEduCenter.Repository;

import com.ntscorp.SQAEduCenter.Model.MongoTestModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MongoTestRepository extends MongoRepository<MongoTestModel, String> {
    MongoTestModel findByName(String name);
}