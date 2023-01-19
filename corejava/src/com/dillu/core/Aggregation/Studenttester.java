package com.dillu.core.Aggregation;

public class Studenttester {
	
	public static void main(String[] args) {
		
		Address a1=new Address("Kochi","Kerala","india");
		Student s1=new Student(2,"Manu",a1);
		Student s2=new Student(3,"Rai",a1);
		Student s3=new Student(4,"Ami",a1);
		
		s1.dispaly();
		s2.dispaly();;
		s3.dispaly();
	}
}
	


