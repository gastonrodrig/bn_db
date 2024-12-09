package com.tutorial.back_tpg.dtos;

public class EquipmentDto {
  private String nombre;
  private int precio;
  
  public EquipmentDto() {
  }
  
  public EquipmentDto(int precio, String nombre) {
    this.precio = precio;
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public int getPrecio() {
    return precio;
  }
  
  public void setPrecio(int precio) {
    this.precio = precio;
  }
}
