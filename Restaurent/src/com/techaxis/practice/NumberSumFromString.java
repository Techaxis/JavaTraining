package com.techaxis.practice;

import java.util.ArrayList;
import java.util.List;

public class NumberSumFromString {
public static void main(String[] args) {
	List<String>listOfNumber=new ArrayList<>();
	listOfNumber.add("12");
	listOfNumber.add("43");
	listOfNumber.add("32");
	listOfNumber.add("4");
	listOfNumber.add("6");
	listOfNumber.add("87");
	listOfNumber.add("9");
	listOfNumber.add("6");
	listOfNumber.add("5");
int sumOfString=0;
	for(String s:listOfNumber) {
		sumOfString=sumOfString+Integer.parseInt(s);
	}
	System.out.println("The sum is"+sumOfString);
}
}
