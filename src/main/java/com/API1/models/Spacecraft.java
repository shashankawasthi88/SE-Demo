package com.API1.models;

public class Spacecraft {
  private String description;
    
  // The unique identifier of a spacecraft
  private SpacecraftId id;
    
  private String name;
    
  private String type;
    
  public String getDescription() {
        return this.description;
  }

  public void setDescription(String description) {
        this.description = description;
  }

  // The unique identifier of a spacecraft
  public SpacecraftId getId() {
        return this.id;
  }

  // The unique identifier of a spacecraft
  public void setId(SpacecraftId id) {
        this.id = id;
  }

  public String getName() {
        return this.name;
  }

  public void setName(String name) {
        this.name = name;
  }

  public String getType() {
        return this.type;
  }

  public void setType(String type) {
        this.type = type;
  }
}
