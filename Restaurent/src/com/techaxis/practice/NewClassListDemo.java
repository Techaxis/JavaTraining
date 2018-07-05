package com.techaxis.practice;

import java.util.ArrayList;
import java.util.List;

public class NewClassListDemo {
	 ArrayList<String> listElement = new ArrayList<>();
	private int indexRemove = 0;

	public static void main(String[] args) {
		NewClassListDemo obj = new NewClassListDemo();
		obj.setInfo("Hem");
		obj.setInfo("RAM");
		obj.setInfo("bIBEK");
		obj.setInfo("HARI");
		obj.setInfo("BINOD");
		obj.setInfo("RONALDO");
		obj.setInfo("ROHIT");
		obj.setInfo("Yagya");
		obj.setInfo("Kalpana");
		obj.setInfo("Rohit");
		obj.setInfo("Kumar");
		obj.setInfo("Ramita");
		obj.setInfo("ROHIT");
		obj.setInfo("Yagya");
		obj.setInfo("Kalpana");
		obj.setInfo("Rohit");
		obj.setInfo("Kumar");
		obj.setInfo("Ramita");
		obj.setInfo("Rama");
		obj.setInfo("Harish");
		obj.setInfo("Kunwar");
		obj.setInfo("Sungar");
		obj.setInfo("ROHIT");
		obj.setInfo("Yagya");
		obj.setInfo("Kalpana");
		obj.setInfo("Rohit");
		obj.setInfo("Kumar");
		obj.setInfo("Ramita");
		obj.setInfo("Rama");
		obj.setInfo("Harish");
		obj.setInfo("Kunwar");
		obj.setInfo("Sungar");
		obj.setInfo("ROHIT");
		obj.setInfo("Yagya");
		obj.setInfo("Kalpana");
		obj.setInfo("Rohit");
		obj.setInfo("Kumar");
		obj.setInfo("Ramita");
		obj.setInfo("Rama");
		obj.setInfo("Harish");
		obj.setInfo("Kunwar");
		obj.setInfo("Sungar");
		
		obj.showInfo();
	}

	private void showInfo() {
		for (String name : listElement) {
			System.out.println(name);
		}

	}

	private void setInfo(String name) {

		if (listElement.size() < 10) {

			listElement.add(name);
			indexRemove = 0;
		} else {
			listElement.remove(indexRemove);
			listElement.add(name);
			//System.out.println("I am in loop else");
//			indexRemove++;
//			if (indexRemove == 10) {
//				indexRemove = 0;
//				// System.out.println("I am in loop if");
//			}
		}

	}

}
