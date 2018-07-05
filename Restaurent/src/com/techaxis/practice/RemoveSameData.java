package com.techaxis.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RemoveSameData {
	private int id;
	private String emailID;
	public RemoveSameData() {
		// TODO Auto-generated constructor stub
	}
	RemoveSameData []dataList=new RemoveSameData[12];
public void loadTableAndRemoveDuplicate() {
	try {
		BufferedReader readerBufferedData=new BufferedReader(new FileReader(new File("C:\\Users\\E15\\Desktop\\repeatedEmail.csv")));
	readerBufferedData.readLine();
	String emailList="";
	int counter=0;
	while((emailList=readerBufferedData.readLine())!=null) {
		String parseEmail[]=emailList.split(",");
		//dataList
	}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
