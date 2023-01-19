package com.dillu.core.Mapinterface;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Mapinterface {
public static void main(String[] args) {

	
	 //HashMap<String,Integer>m1=new HashMap<String,Integer>();
	 //m1.put("java", 25);
	 //m1.put("php", 15);
	 //m1.put("android", 35);
	 //m1.put("c", 40);
	 //m1.put("sql", 18);
	 //m1.put("asp", 32);
	 //System.out.println(m1);
	 
	 //Hashtable<String,Integer>m4=new Hashtable<String,Integer>();
	 //m4.put("java", 25);
	 //m4.put("php", 15);
	 //m4.put("android", 35);
	 //m4.put("c", 40);
	 //m4.put("sql", 18);
	 //m4.put("asp", 32);
	 //System.out.println(m4);
	 
	 LinkedHashMap<String, Integer>m2=new LinkedHashMap<String,Integer>();
	 m2.put("java", 25);
	 m2.put("php", 15);
	 m2.put("android", 35);
	 m2.put("c", 40);
	 m2.put("sql", 18);
	 m2.put("asp", 32);
	 System.out.println(m2);
	 
	
	 Iterator<String> itr=m2.keySet().iterator();
	 while(itr.hasNext())
	 {
		 String key=itr.next();
         int val=m2.get(key);
		 System.out.println(key + " = " + val);
	 }
	 
	 
	// TreeMap<String, Integer>m3=new TreeMap<String,Integer>();
	 //m3.put("java", 25);
	 //m3.put("php", 15);
	 //m3.put("android", 35);
	 //m3.put("c", 40);
	 //m3.put("sql", 18);
	 //m3.put("asp", 32);
	// System.out.println(m3);
}
}

