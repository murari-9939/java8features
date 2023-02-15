package java8features;

import java.util.ArrayList;
import java.util.List;

public class Listforeachmethod {
	public static void main(String[] args) {
		List<Person>list1= new ArrayList<Person>();
		list1.add(new Person("Ramesh",29));
		list1.add(new Person("Tony",50));
		list1.add(new Person("Ramesh",29));
		list1.add(new Person("Tom",45));
//		itrating the list using for ecah method
//		for(Person person:list1) {
//			System.out.println(person.getName());
//			System.out.println(person.getAge());
//			using lambada expression
//		list1.forEach((person)->{
//		System.out.println(person.getName());
//		System.out.println(person.getAge());
//		});
		
//	using for each with stream
		list1.stream().forEach((person1)->{
			System.out.println(person1.getAge());
			System.out.println(person1.getName());
		});
		
	}}
			
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}