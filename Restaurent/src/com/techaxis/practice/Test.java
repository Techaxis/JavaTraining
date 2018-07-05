package com.techaxis.practice;

public class Test {
	static int i=6;
	
	
	Test(){
		System.out.println(++i);
	}
	static {
		System.out.println("I am static block");
	}
	public static void main(String[] args) {
		Test t=new Test();
		Test t2=new Test();
		Test t3=new Test();
		String firstName="Bishal";
		String lastName=" Pun";
		firstName.concat(lastName);
		System.out.println(firstName);
	
		firstName=firstName.concat(lastName);
		System.out.println(firstName);
		
	}

}
