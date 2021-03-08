package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Harry", "Potter", Gender.MALE);
        Person person2 = new Person("Hermione","Granger",Gender.FEMALE );
        Person person3 = new Person("Ronald", " Weasley",Gender.MALE);
        Person person4 = new Person("Hermione", "Granger", Gender.FEMALE);
        Person person5 = new Person("Harry","Potter", Gender.MALE);

        Set<Person> set = new HashSet<>();

        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("Общее количество элементов в коллекции: " + set.size());








    }
}
