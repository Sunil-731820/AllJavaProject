package com.java.jsf.abhisek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	
	public static List<Member> saveAllMember() throws ParseException{
		List<Member> listOfMemeber = new ArrayList<Member>();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Member id ");
		int id = sc.nextInt();
		System.out.println("Enter the Member First name ");
		String firstName = sc.nextLine();
		System.out.println("Enter the Member Last Name");
		String lastName = sc.nextLine();
		System.out.println("Enter The Gender");
		String gender = sc.nextLine();
		System.out.println("Enter the Address");
		String address = sc.nextLine();
		System.out.println("Enter the Start Date");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sc.nextLine();
		Date startDate = sdf.parse(date);
		
		System.out.println("Enter The End Date");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = sc.nextLine();
		Date endDate = sdf1.parse(date1);
		
		System.out.println("Enter The Pin Code");
		int pinCode = sc.nextInt();
		
		System.out.println("Enter The Salary ");
		double salary = sc.nextDouble();
		
		listOfMemeber.add(new Member(id, firstName, lastName, Gender.valueOf(gender), address, startDate, endDate, pinCode, salary));
		
		return listOfMemeber;
	}
	
	public static void main(String[] args) throws ParseException {
//		saveAllMember();
		List<Member> listOfMem = saveAllMember();
		for(Member member:listOfMem) {
			System.out.println(member);
		}
	}

}
