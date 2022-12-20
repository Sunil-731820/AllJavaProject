package com.java.jsf.abhisek;

import java.util.Date;

public class Member {
	
	private int memberId;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String address;	
	private Date startDate;
	private Date endDate;
	private int pinCode;
	private double salary;
	
	
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Member(int memberId, String firstName, String lastName, Gender gender, String address, Date startDate,
			Date endDate, int pinCode, double salary) {
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.startDate = startDate;
		this.endDate = endDate;
		this.pinCode = pinCode;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", address=" + address + ", startDate=" + startDate + ", endDate=" + endDate + ", pinCode="
				+ pinCode + ", salary=" + salary + "]";
	}
	
	

}
