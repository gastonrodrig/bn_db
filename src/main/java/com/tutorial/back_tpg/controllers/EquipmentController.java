package com.tutorial.back_tpg.controllers;

import com.tutorial.back_tpg.dtos.EquipmentDto;
import com.tutorial.back_tpg.models.Equipment;
import com.tutorial.back_tpg.services.EquipmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Equipments")
@RequestMapping("/equipments")
public class EquipmentController {
  
  @Autowired
  EquipmentService equipmentService;
  
  @Operation(summary = "Devuelve todos los equipos")
  @GetMapping
  public ResponseEntity<List<Equipment>> getAll() {
    return ResponseEntity.ok(equipmentService.getAll());
  }
  
  @Operation(summary = "Devuelve un equipo por id")
  @GetMapping("/{id}")
  public ResponseEntity<Equipment> getOne(@PathVariable("id") String id) {
    return ResponseEntity.ok(equipmentService.getOne(id));
  }
  
  @Operation(summary = "Crea un equipo")
  @PostMapping
  public ResponseEntity<Equipment> create(@RequestBody EquipmentDto dto) {
    return ResponseEntity.ok(equipmentService.create(dto));
  }
  
  @Operation(summary = "Actualiza un equipo")
  @PutMapping("/{id}")
  public ResponseEntity<Equipment> update(
    @PathVariable("id") String id,
    @RequestBody EquipmentDto dto
  ) {
    return ResponseEntity.ok(equipmentService.update(id, dto));
  }
  
  @Operation(summary = "Elimina un equipo")
  @DeleteMapping("/{id}")
  public ResponseEntity<Equipment> delete(@PathVariable("id") String id) {
    return ResponseEntity.ok(equipmentService.delete(id));
  }
}
