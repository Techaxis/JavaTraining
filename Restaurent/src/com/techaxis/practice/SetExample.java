package com.techaxis.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class SetExample {
List<String>name2=new ArrayList<>();

Set<String>name1=new HashSet<String>();

public static void main(String[] args) {
	SetExample objSet=new SetExample();
	objSet.showSetAndListData();
}

private void showSetAndListData() {
	// TODO Auto-generated method stub
	name2.add("Hem");
	name2.add("Hem");
	name2.add("Hem");
	name2.add("Hem");
	name1.add("Hari");
	name1.add("Hari");
	name1.add("Hari");
	name1.add("Hari");
		for(String s:name2) {
			System.out.println(s);
		}
		for(String s1:name1) {
			System.out.println(s1);
		}
			
}
}
