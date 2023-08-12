package com.io.stream;

import java.io.FileReader;

public class Test04_ReadingDataUsingFR {

	public static void main(String[] args) {
  try(FileReader fr=new FileReader("abc.txt")){
	  int data ;
	  while((data=fr.read())!=-1) 
	  System.out.print(data);
  }catch(Exception e) {
	  System.out.println(e.getLocalizedMessage()); 
  }
	}

}
