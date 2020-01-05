package com.corejava;

public class Loops {

	public static void main (String args[]) {
		int value = 10, j = 10;
		while(value < 15) {
			System.out.println("Looping with While: Value=" +value +"\n");
			value++;
		}
			for(j =0; j< value; j++) {
				System.out.println("println:Looping with For: j=" +j +"\n");
				System.out.printf("printf: Looping with For: j= %d\n", j);
			}
	}
}
