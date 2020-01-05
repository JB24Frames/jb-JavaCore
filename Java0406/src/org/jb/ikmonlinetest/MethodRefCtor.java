package org.jb.ikmonlinetest;
import java.util.*;
import java.util.function.*;

//public class Sandbox {}
public class MethodRefCtor {
//	     what method we have to pleace here to get output [RED, Green , Blue]
// 1)-->
	 /*static void populate(Supplier s,String... stuff) {
        List l = s.get();
        for (int i=0; i< stuff.length;++i)
            l.add(stuff[i]);
        System.out.println(l);
    }*/
//	2--> 	
	/*static void populate(Collection<String> c,String... stuff) {
        for (int i=0; i< stuff.length;++i)
            c.add(stuff[i]);
        System.out.println(c);
    }*/
//	3)-->	
	/*static void populate(Supplier<List> s,String... stuff) {
        for (int i=0; i< stuff.length;++i)
            s.add(stuff[i]);
        System.out.println(s);
    }*/
//	4)-->	
	static void populate(Supplier<List> s,String... stuff) {
        List l = s.get();
        for (int i=0; i< stuff.length;++i)
            l.add(stuff[i]);
        System.out.println(l);
    }
//	5)-->	
	/*static void populate(Consumer<String> s,String... stuff) {
        for (int i=0; i< stuff.length;++i)
            s.accept(stuff[i]);
        System.out.println(s);
    }*/
	
		    public static void main(String[] args) {
	        MethodRefCtor mrc = new MethodRefCtor();
	        populate(ArrayList::new,"Red","Green","Blue");
	    }

	}
