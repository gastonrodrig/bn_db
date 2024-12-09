package com.tutorial.back_tpg.repositories;

import com.tutorial.back_tpg.models.Equipment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends MongoRepository<Equipment, String> {

}
