package com.io.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test01_ReadingDataUsing_FISH {

	public static void main(String[] args) throws IOException {
    final String FileName="abc.txt";
	//connected to a file, connection is established 	
    FileInputStream fish=new FileInputStream(FileName);
    int data;
    while((data=fish.read())!=-1)
    System.out.println((char)data);
	fish.close();
  }
}
