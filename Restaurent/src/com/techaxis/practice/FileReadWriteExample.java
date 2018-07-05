package com.techaxis.practice;

public class FileReadWriteExample {
public static void main(String[] args) {
	System.out.println("error here message"); 
	String tex="I am Hem. I study java in Techaxis";
	String name=tex.substring(5, 8);
	System.out.println(name);
	String number="3,5,7,3,7,3,2,5,7";
	String[]numArray=number.split(",");
	int sum=0;
	for(String num:numArray) {
		System.out.println(num);
		sum=sum+Integer.parseInt(num);
	}
	System.out.println("The sum "+sum);
}
}
