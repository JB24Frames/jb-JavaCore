package com.corejava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 6;
		int[] values;
		values = new int[3];
		System.out.println("Array Value at[0] intially:" +values[0]);
		values[1] = 6;
		values[2] = 2;
		values[0] = 19;

		System.out.println("Value at index[0]:" +values[0]);
		System.out.println("Value at index[0]:" +values[1]);
		System.out.println("Value at index[0]:" +values[2]);
		
		for(int i=0; i < values.length; i++ ) {
				System.out.println("values indexed from ArrayLength values[i]:" +values[i]);
		}
		
		int[] numbers = {2,4,6,8,15};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("values indexed from Array Length numbers[i]:" +numbers[i]);
		}

	}

}
