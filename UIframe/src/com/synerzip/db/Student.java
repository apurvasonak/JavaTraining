package com.synerzip.db;

public class Student {
	int rollno;
	String name;
	String address;
	float marks;
	String gender;
	private String selectedItem;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int i) {
		this.rollno = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float f) {
		this.marks = f;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(String selectedItem) {
		// TODO Auto-generated method stub
		this.selectedItem=selectedItem;
		
	}
	public String getAge() {
		// TODO Auto-generated method stub
		return selectedItem;
	}
	
	

}
