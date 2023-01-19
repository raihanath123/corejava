package com.dillu.core.module3coding1;
import java.util.*;
public class ConvertHashsettoArrayList {
public static void main(String[] args) {
	    
	HashSet<String>h_st=new HashSet<String>();
	h_st.add("pen");
	h_st.add("book");
	h_st.add("txt");
	h_st.add("color");
	System.out.println("original Hashset  "+h_st);
	List<String> list =new ArrayList<String>(h_st);
	System.out.println("ArrayList contains:"+list);
	
	
	
}
}
