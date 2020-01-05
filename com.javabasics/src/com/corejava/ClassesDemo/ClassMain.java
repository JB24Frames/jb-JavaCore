package com.corejava.ClassesDemo;

class OutsideClass{
//	Can contain Data or State, Instance Variables, Subroutines or Methods
	
	String name;
	int age;
	char gender;
	
	void getDat(String name1, int age1, char gender1) {
		System.out.println("You are in OutsideClass Method:");
		System.out.println("Person1 Details through OutsideClass method getData():\t" +name1 +"\t" +age1 +"\t" +gender1);
	}
	
		
	
}

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You are in Main Calss:");
		OutsideClass obj = new OutsideClass();
		obj.name = "Bobby Chowdary";
		obj.age = 28;
		obj.gender = 'M';
		System.out.println("Person1 Details through OutsideClass DataFields:\t" +obj.name +"\t" +obj.age +"\t" +obj.gender);
		OutsideClass obj1 = new OutsideClass();
		obj1.getDat("Jagadeesh Battula", 28, 'M');

	}

}
