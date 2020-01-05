package org.jb.ikmonlinetest;

import java.util.stream.Stream;

public class TestIndicesMain {

	public static void main(String[] args) {
		
		Stream.of(new Indices("Mercury"),new Indices("Venus"),new Indices("Earth"))
        .flatMap( i -> i.indices.stream())
        .mapToInt(j -> j)
        .max()
        .ifPresent(s -> System.out.println(s)); 
     }   
}

