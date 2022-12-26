package com.java.jsf.Date;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Date {
	
	
	public Date getDate() {
		 Date current_Date = new Date();
	     System.out.println(current_Date);
	     return current_Date;
	}
	public static void main(String[] args) {
		 Date current_Date = new Date();
	        //"Date" class
	        //"current_Date" is Date object
	 
	        System.out.println(current_Date.toString());
	        // print the time and date
	}

}
