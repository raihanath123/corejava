package com.dillu.core.module3coding1;
import java.util.HashMap;
import java.util.Map;

import java.util.TreeMap;
public class SortHashmapbyKeys {
 public static void main(String[] args) {
	
	 Map<String,String>unsortedMap=new HashMap<>();
	 unsortedMap.put("apple","apple");
	 unsortedMap.put("pinapple", "pinapple");
	 unsortedMap.put("banana", "banana");
	 unsortedMap.put("grape", "grape");
	 for(Map.Entry<String,String>entry:unsortedMap.entrySet());
	 {
		
		 System.out.println("unSorted key value="+entry.getKey());
	 }
	 Map<String,String> treeMap=new TreeMap<String,String>(unsortedMap);
	 for(Map.Entry<String,String>entry:treeMap.entrySet())
	 {
		 System.out.println("Sorted key value="+entry.getKey());
	 }
}
}
