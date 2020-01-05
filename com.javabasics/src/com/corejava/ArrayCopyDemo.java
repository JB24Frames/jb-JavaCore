//import java.util.Arrays;
//Searching an array for a specific value to get the index at which it is placed (the binarySearch method).
//Comparing two arrays to determine if they are equal or not (the equals method).
//Filling an array to place a specific value at each index (the fill method).
//Sorting an array into ascending order. This can be done either sequentially, using the sort method, 
//or concurrently, using the parallelSort method introduced in Java SE 8. Parallel sorting of large arrays on multiprocessor systems is faster than sequential array sorting.
package com.corejava;

public class ArrayCopyDemo {
//	Syntax for Array Copy public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
	public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
        
        char[] copyFrom1 = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
                
            char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom1, 2, 9);
            
            System.out.println(new String(copyTo2));
    }

}
