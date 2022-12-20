package com.java.jsf.CollectionsInJava.Set.LinkedHashSet;

import java.util.ArrayList;
import java.util.List;

class EMploy{
	private int empno;
	private String name;
	@Override
	public String toString() {
		return "EMploy [empno=" + empno + ", name=" + name + "]";
	}
	
	
	
}

public class Student {
	public static void main(String[] args) {
		System.out.println("Example ");
		
		List<EMploy> listofEmploy= new ArrayList<EMploy>();
		System.out.println(listofEmploy);
	}

}
