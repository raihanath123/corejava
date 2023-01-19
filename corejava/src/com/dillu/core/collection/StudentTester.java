package com.dillu.core.collection;
import java.util.HashSet;
import java.util.Set;
public class StudentTester {
	public static void main(String[] args) {
		
		Set s1=new HashSet();
		s1.add(new Student("Dillu",40,26));
		s1.add(new Student("fami",50,21));
		s1.add(new Student("chakkara",40,21));
		s1.add(new Student("Dillu",40,26));
		System.out.println(s1);
	}
	}

