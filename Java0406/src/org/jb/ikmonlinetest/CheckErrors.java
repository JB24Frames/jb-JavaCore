package org.jb.ikmonlinetest;

public class CheckErrors {
//	Q; what the code displays? 
	static int total = 10;
    public void call() {
        int total = 5;
        System.out.println(this.total);
    }
    public static void main (String args []) {
        CheckErrors a1 = new  CheckErrors();
        a1.call();
    }

}
