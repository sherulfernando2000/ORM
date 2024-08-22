package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.FullType;

@Entity
public class Animal {
    @Id
   private int id;
   private String name;

   private FullType type;

   public Animal(){}

    public Animal(int id, String name, FullType type){
       this.id = id;
       this.name = name;
       this.type = type;
    }

    public void setId(int id){
       this.id = id;
    }

    public int getId(){
       return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FullType getType() {
        return type;
    }

    public void setType(FullType type) {
        this.type = type;
    }
}
