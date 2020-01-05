package org.jb.ikmonlinetest;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		// which of them , will display Random Numberfrom 0-10
		System.out.println(Math.round(Math.random() % 10));
		System.out.println(Math.round(Math.random() * 10));
//		System.out.println(Math.random(10));
//		System.out.println(Math.random(0,10));// we have remove args on both top and this stmt.
		System.out.println(Math.random() *10);

	}

}
