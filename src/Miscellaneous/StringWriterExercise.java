package Miscellaneous;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterExercise {

	public static void main(String[] args) throws IOException {
	
		String s = "THis osjidnsj jfnjkd nk";
		FileReader sr = new FileReader(s);
		
		
		int c = sr.read();
		System.out.println((char)c);


	}

}
