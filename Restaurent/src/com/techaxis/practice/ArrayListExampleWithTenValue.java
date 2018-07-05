package com.techaxis.practice;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExampleWithTenValue {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		//System.out.println("Enter the Name to add the array list");
		String stopPoint = "notExit";
		int indexValue = 0;
		
		while (stopPoint != "exit") {
			
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the name to add");
			String addName = reader.nextLine();
			if (nameList.size() < 10) {
				nameList.add(addName);
				indexValue = 0;
			} else {
				nameList.remove(indexValue);
				nameList.add(indexValue, addName);
				indexValue++;
			}
			System.out.println("Do you want to stop adding the names plese type 'exit'");

			stopPoint = reader.next();
		}
System.out.println("YOu entered the List of String as following and repeatationof value more than ten times are omitted and placed in the rearranged form");
		for (String showName : nameList) {
			System.out.println(showName);
		}
		
	}

}
