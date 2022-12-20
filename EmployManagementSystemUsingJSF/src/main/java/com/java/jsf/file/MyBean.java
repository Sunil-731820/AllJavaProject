package com.java.jsf.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBean {
	
	private  static String text;
	
//	static {
//		File file = new File("C:\\Users\\sunilg\\Desktop\\hello.txt");
//		if(file.exists()) {
//			// Creates a FileReader with default encoding
//		      try {
//				FileReader input1 = new FileReader(file);
//				System.out.println(input1.getEncoding());
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}else {
//			System.out.println("File Of This Name Does Not Exits");
//		}
//	}

	public static void main(String[] args) throws IOException {
		File file = new File(
	            "C:\\Users\\sunilg\\Desktop\\hello.txt");
	 
	        // Note:  Double backquote is to avoid compiler
	        // interpret words
	        // like \test as \t (ie. as a escape sequence)
	 
	        // Creating an object of BufferedReader class
	        BufferedReader br
	            = new BufferedReader(new FileReader(file));
	 
	        // Declaring a string variable
	        String st;
	        // Condition holds true till
	        // there is character in a string
	        while ((st = br.readLine()) != null)
	 
	            // Print the string
	            System.out.println(st);
	}
}
