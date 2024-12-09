package com.tutorial.back_tpg.services;

import com.tutorial.back_tpg.dtos.EquipmentDto;
import com.tutorial.back_tpg.models.Equipment;
import com.tutorial.back_tpg.repositories.EquipmentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
  
  @Autowired
  EquipmentRepository equipmentRepository;
  
  public Equipment create(EquipmentDto dto) {
    Equipment equipment = new Equipment(dto.getPrecio(), dto.getNombre());
    return equipmentRepository.save(equipment);
  }
  
  public List<Equipment> getAll() {
    return equipmentRepository.findAll();
  }
  
  public Equipment getOne(String id) {
    return equipmentRepository.findById(id).get();
  }
  
  public Equipment update(String id, EquipmentDto dto) {
    Equipment equipment = equipmentRepository.findById(id).get();
    equipment.setNombre(dto.getNombre());
    equipment.setPrecio(dto.getPrecio());
    return equipmentRepository.save(equipment);
  }
  
  public Equipment delete(String id) {
    Equipment equipment = equipmentRepository.findById(id).get();
    equipmentRepository.delete(equipment);
    return equipment;
  }
}
