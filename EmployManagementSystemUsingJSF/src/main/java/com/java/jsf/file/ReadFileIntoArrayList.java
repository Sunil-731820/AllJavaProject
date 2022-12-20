package com.java.jsf.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoArrayList {
	
	
	public static void main(String[] args) {
		 // reading text file into List in Java 7
	    List<String> lines = Collections.emptyList();
	    try {
	      lines = Files.readAllLines(Paths.get("C:\\Users\\sunilg\\Desktop\\hello.txt"), StandardCharsets.UTF_8);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }

	    System.out.println("Content of List:");
	    System.out.println(lines);
	}

}
