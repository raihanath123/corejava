package com.dillu.core.module3coding1;
import java.util.LinkedList;
public class Insertanelementspecifiedpositionlinkedlist {

	 public static void main(String[] args) {
	   
		    LinkedList <String> l_list =new LinkedList <String>();
			l_list .add("black");
			l_list.add("orange");
			l_list.add("white");
			l_list.add("green");
			System.out.println("Original linked list");
			System.out.println("Add color gray after orange:"+l_list);
			l_list.add(2,"gray");
			System.out.println("linked list:"+ l_list);
			
		}
	}

