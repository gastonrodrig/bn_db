package com.tutorial.back_tpg.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Equipment")
public class Equipment {
  @Id
  @Field("_id")
  private String id;
  private String nombre;
  private int precio;
  
  public Equipment() {
  }
  
  public Equipment(int precio, String nombre) {
    this.precio = precio;
    this.nombre = nombre;
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
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
