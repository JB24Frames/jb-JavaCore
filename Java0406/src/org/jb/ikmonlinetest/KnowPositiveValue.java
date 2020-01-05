package org.jb.ikmonlinetest;

public class KnowPositiveValue {

	public static void main(String[] args) {
	
//		know the positive value of x out of these all operations
		int a,b,x,y,z;
		x= -1;
		x = x >>> 1;
		System.out.println(x);
		a= -1;
		a = a >>> 32;
		System.out.println(a);
		b = -1;
		b = b >> 32;
		System.out.println(b);
		y = -1;
		y = y >> 1;
		System.out.println(y);
		z = -1;
		z = z >>> 0;
		System.out.println(z);

	}

}
