package com.dillu.core.Encapsulation;

public class Tester {
 public static void main(String[] args) {
	
	 
	 Employee e1=new Employee();
	 e1.setName("Arun");
	 e1.setAge(25);
	 e1.setSalary(1000);
	 
	 
	 System.out.println(e1.getName());
	 System.out.println(e1.getAge());
	 System.out.println(e1.getSalary());
}
}
