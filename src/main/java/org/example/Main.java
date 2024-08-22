package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullType;
import org.example.entity.Animal;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        FullType type = new FullType("Mammal","Fish");
        Animal animal = new Animal();
        animal.setId(3);
        animal.setName("Dolphin");
        animal.setType(type);


        Transaction transaction = session.beginTransaction();


        //save()
        session.save(animal);
        //delete()
        //session.delete(animal);
        Animal animal1 = session.get(Animal.class,1);
        System.out.println(animal1.toString());
        transaction.commit();
        session.close();




    }
}