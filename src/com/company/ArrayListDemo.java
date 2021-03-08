package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
	Person person1 = new Person("Harry", "Potter", Gender.MALE);
	Person person2 = new Person("Hermione","Granger",Gender.FEMALE );
	Person person3 = new Person("Ronald", " Weasley",Gender.MALE);
	Person person4 = new Person("Harry", "Potter", Gender.MALE);
	Person person5 = new Person("Harry","Potter", Gender.MALE);

	List<Person> list = new ArrayList<>();

	list.add(person1);
	list.add(person2);
	list.add(person3);
	list.add(person4);
	list.add(person5);

	for (int i = 0; i < list.size(); i++){
		System.out.println(list.get(i));
	}

	System.out.println();

	System.out.println("Общее количество элементов в коллекции: " + list.size());

    }
}
