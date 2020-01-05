package com.corejava;

public class ArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words[] = new String[4];
//		words = {"I am", "Jagadeesh", "Battula", "Java Developer"};
		words[0] = "I am";
		words[1] = "A Student My";
		words[2] = "Name Is";
		words[3] = "Jaagdeesh Battula";
		
		System.out.println("Printing Array Values at index[3]:" +words[3]);
		String fruits[]= {"Banana", "Apple", "Orange", "Berries"};
		
		for(String fruit: fruits) {
			System.out.println("New for loop fruit[index]:" +fruit);
		}
		
		int value =0;
		String text = null;
		System.out.println("printing Empty String: Assigned null: " +text);
		String[] texts = new String[4];
		System.out.println("Printing values of a String Array of texts at atindex[0,3] before intializing:" +texts[0] +texts[3]);
		texts[0] = "Boobby";
		texts[1] = null;
		texts[3] = "Battula";
		texts[1] = null;
		System.out.println("Printing values of a String Array of texts at atindex[0, 1, 2, 3] before intializing:" +texts[0] +texts[1] +texts[2] +texts[3]);
				
		

	}

}
