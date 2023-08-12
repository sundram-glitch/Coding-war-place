package com.io.stream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test06_ReadingOneLineAtATimeUsingBR {
   public static void main(String[] args) {
	try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
   )
	{
	String line;
	while((line=br.readLine())!=null) {
	System.out.println(line);
	}
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
   }
}
