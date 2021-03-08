package com.company;

import java.util.HashMap;
import java.util.Map;


public class MapDemo {

    public static void main(String[] args){
        Map<Integer, Person> people = new HashMap<>();

        Person person1 = new Person("Harry", "Potter", Gender.MALE);
        Person person2 = new Person("Hermione","Granger",Gender.FEMALE );
        Person person3 = new Person("Ronald", "Weasley",Gender.MALE);
        Person person4 = new Person("Harry", "Potter", Gender.MALE);
        Person person5 = new Person("Harry","Potter", Gender.MALE);

        people.put(1, person1);
        people.put(2, person2);
        people.put(3, person3);
        people.put(4, person4);
        people.put(5, person5);

//        for (Map.Entry entry: people.entrySet()){
//            System.out.println(entry);
//        }

        for (Map.Entry<Integer, Person> pair : people.entrySet()){
            Integer key = pair.getKey();
            Person value = pair.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println();

        System.out.println("Общее количество элементов в коллекции: " + people.size());


    }

























}
