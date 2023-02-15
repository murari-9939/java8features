package java8features;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setforecaheaxmple {
	public static void main(String[] args) {
		Set<Person>list1= new HashSet<>();
		list1.add(new Person("Ramesh",29));
		list1.add(new Person("Tony",50));
		list1.add(new Person("Ramesh",29));
		list1.add(new Person("Tom",45)); 
//		itrating the list using for ecah method
//		for(Person person:list1) {
//			System.out.println(person.getName());
//			System.out.println(person.getAge());
		
	}

}
