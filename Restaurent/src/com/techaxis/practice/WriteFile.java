package com.techaxis.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFile {
public void writeFile() {
	File fileToWrite=new File("D:\\\\JavaWorkspace\\\\RIMS\\\\Database\\WrittenFile.txt");
	try {
		Writer writer=new FileWriter(fileToWrite,true);
		writer.write("I am hem \n");
		writer.write("I am studying java at techaxis \n");
		writer.write("I am not hem");
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	WriteFile obj=new WriteFile();
	obj.writeFile();
	System.out.println("File read succissfully!");
}
}
