package org.jb.ikmonlinetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class FileAccessing {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
//		which of the following is right when accessing fiels

//		InputStreamReader isr = new InputStreamReader("file.txt", "UTF-16E");
		
		FileInputStream fis = new FileInputStream("file.txt");
//	    FileReader fr = new FileReader(fis);
	    
		RandomAccessFile rf = new RandomAccessFile("file.txt", "r");
		
//		FileReader fr1 = new Reader("file.txt");
		
		FileInputStream fis1 = new FileInputStream("file.txt");
	    InputStreamReader isr1 = new InputStreamReader(fis, "UTF-8");


	}

}
