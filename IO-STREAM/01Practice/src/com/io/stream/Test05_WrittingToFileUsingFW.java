package com.io.stream;

import java.io.FileWriter;

public class Test05_WrittingToFileUsingFW {

	public static void main(String[] args) {
   try( FileWriter fw=new FileWriter("abc.txt",true))
   {
	   fw.write("\u0001F600");
   System.out.println("data is saved to file");
   System.out.println();
   }
   catch(Exception e) {
	e.printStackTrace();   
   }
	}

}
