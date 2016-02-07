package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CustomMapKey {

	public static void main(String[] args) {

		Person p1 = new Person(10, "yogesh");
		Person p2 = new Person(12, "yogesh1");
		Person p3 = new Person(10, "yogesh");

		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());

		HashMap<Person, Person> map1 = new HashMap<Person, Person>();
		map1.put(p1, p1);
		map1.put(p2, p2);
		map1.put(p3, p3);
		
		map1.remove(p3);

		for (Iterator iterator = map1.entrySet().iterator(); iterator.hasNext();) {
			Entry<Person, Person> entry = (Entry<Person, Person>) iterator
					.next();
			System.out.println(entry.getKey().toString());
		}

	}

}

class Person {
	int age;
	String name;

	public Person() {
		super();
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Age : " + age + " Name " + name;
		// return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
}