package com.techaxis.practice;

//import java.io.ObjectOutput;

public class Example {
//	private int a;
//	private int b;
//	private int c;
	private void getSum(int a,int b) {
		System.out.println("The sum is"+(a+b));
	}
	private void getSum(int a,int b,int c) {
		System.out.println("The sum is"+(a+b+c));
	}
	public void setAndShowValueToSecondClass() {
		SecondClass objOfSecondClass = new SecondClass();
		objOfSecondClass.setAddress("Kathmandu");
		objOfSecondClass.setName("Bunu Bhattarai And Tank Weeding");
		System.out.println(objOfSecondClass);

	}

	public static void main(String[] args) {
		int x=5;
		int y=5;
		int z;
		z=x>y?x:y;
		Example objOfExample = new Example();
		objOfExample.setAndShowValueToSecondClass();
		objOfExample.setAndShowValueToSecondClass();
		objOfExample.setAndShowValueToSecondClass();
		objOfExample.setAndShowValueToSecondClass();
		objOfExample.setAndShowValueToSecondClass();
		objOfExample.setAndShowValueToSecondClass();
		objOfExample.getSum(4, 6);
		objOfExample.getSum(3, 4, 7);
		System.out.println(z);
	}

}
