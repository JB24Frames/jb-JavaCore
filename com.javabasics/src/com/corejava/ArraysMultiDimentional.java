package com.corejava;

public class ArraysMultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int values[] = {2,4,6,15};
		System.out.println("Single dimentional Array:" +values[2]);
		
		int gridValues[][] = {
				{2,4,6,15},
				{25,46,125},
				{23,42,61,151,76},
				{12,14,16,15}
		};
		
		System.out.println("Array Value at Row x Column:" +gridValues[0][0] +"\t" +gridValues[0][1] +"\t" +gridValues[0][2] +"\t" +gridValues[0][3]);
		System.out.println("Array Value at Row x Column:" +gridValues[1][0] +"\t" +gridValues[1][1] +"\t" +gridValues[1][2]);
		System.out.println("Array Value at Row x Column:" +gridValues[2][0] +"\t" +gridValues[2][1] +"\t" +gridValues[2][2] +"\t" +gridValues[2][3] +"\t" +gridValues[2][4]);
		System.out.println("Array Value at Row x Column:" +gridValues[3][0] +"\t" +gridValues[3][1] +"\t" +gridValues[3][2] +"\t" +gridValues[3][3]);

		System.out.println("Printing Row by Col values with For Loop:");
		for(int row =0;row<gridValues.length; row++) {	
			for (int col=0; col<gridValues[row].length; col++) {
				System.out.printf(+gridValues[row][col] +"\t");
			}
			System.out.println("---------------------------");
		}
	}

}
