package Miscellaneous;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

public class StringRead {

	public static void main(String[] args) throws IOException {
//		  File file = new File("D:/myfile.txt");
//	      FileInputStream fis = new FileInputStream(file);
//	      byte bytes[] = new byte[(int) file.length()];
//	      byte b[] = new byte[3];
//	      //Reading data from the file
//	      fis.read();
//	      System.out.println(b[0]);
	      //Writing data to another file
	      File out = new File("D:/CopyOfmyFile.txt");
	      FileOutputStream outputStream = new FileOutputStream(out);
	      
	      PrintStream pout=new PrintStream(outputStream);    
	      pout.println(2016);    
	      pout.println("Hello Java");    
	      pout.println("Welcome to Java");    
	      pout.close();    
	      outputStream.close();    
	     System.out.println("Success?");    

         }

	}


