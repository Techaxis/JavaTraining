/*package com.techaxis.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.techaxis.people.Utility;

//import com.sun.java.util.jar.pack.ConstantPool.Entry;

public class MapExample {
	private static final String[] AVAILABLE_FOOD = new String[] { "momo", "burger", "PIZZA", "coke", "Beer" };;
	List<String>listOfFood=new ArrayList<String>();
	for(int i=0;i<8;i++) {
		listOfFood.add(AVAILABLE_FOOD[i]);
	}
	Map<Integer,String>testMap=new HashMap<Integer,String>();
public static void main(String[] args) {
	MapExample objMap=new MapExample();
	objMap.setAndShow();
	
}
private void setAndShow() {
	// TODO Auto-generated method stub
	testMap.put(1, "Hari");
	testMap.put(2, "Ram");
	testMap.put(3, "Gopal");
	testMap.put(4, "Ramesh");
	testMap.put(5, "Messi");
	testMap.put(5, "Ronaldo");
	testMap.put(7, "Permi");
	testMap.put(8, "Sarmi");
	testMap.put(9, "Larmi");
	System.out.println(testMap.get(4));
	for(Entry<Integer, String> entry:testMap.entrySet()) {
		System.out.println(entry);
	}
}
}
*/