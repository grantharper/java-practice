package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collections {

	private List<Integer> integerList;
	private List<String> stringList;
	private List<Person> personList;

	public Collections() {
		integerList = new ArrayList<>();
		integerList.add(-50);
		integerList.add(3);
		integerList.add(2);

		stringList = new ArrayList<>();
		stringList.add("AAA");
		stringList.add("C");
		stringList.add("B");
		//sublist adds the parts of the list from a certain index to another
		//this sublist is empty, so it doesn't affect the list at all
		System.out.println("Did the sublist add anything? " + stringList.addAll(stringList.subList(1, 1)));
		
		personList = new ArrayList<>();
		Person person1 = new Person();
		personList.add(person1);
		Person person2 = new Person();
		person2.setNumber(0);
		personList.add(person2);
		
	}

	public static void main(String... args) {

		Collections collections = new Collections();
		System.out.println("--------INTEGER LIST---------");
//		System.out.println("Original Order");
//		collections.print(collections.getIntegerList());
//
//		collections.getIntegerList().sort(Comparator.naturalOrder());
//		System.out.println("Natural Order");
//		collections.print(collections.getIntegerList());
//
//		collections.getIntegerList().sort(Comparator.reverseOrder());
//		System.out.println("Reverse Order");
//		collections.print(collections.getIntegerList());
		collections.sortDemo(collections.getIntegerList());

		System.out.println("--------STRING LIST---------");
		collections.sortDemo(collections.getStringList());
		
		//can't do this because the class doesn't implement Comparable interface
		System.out.println("--------PERSON LIST---------");
		collections.sortDemo(collections.getPersonList());

	}

	public <T> void sortDemo(List<T> list) {

		System.out.println("Original Order");
		this.print(list);
		
//		for(Class inter: list.getClass().getInterfaces()){
//			if(inter.equals(Comparable.class)){
//				
//			}
//		}
		list.sort((Comparator<? super T>) Comparator.naturalOrder());
		System.out.println("Natural Order");
		this.print(list);

		list.sort((Comparator<? super T>) Comparator.reverseOrder());
		System.out.println("Reverse Order");
		this.print(list);

	}

	public <T> void print(List<T> list) {
		Iterator<T> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			if (it.hasNext()) {
				System.out.print(", ");
			}
		}
		System.out.println("");

	}

	public List<Integer> getIntegerList() {
		return integerList;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public List<Person> getPersonList() {
		return personList;
	}

}
