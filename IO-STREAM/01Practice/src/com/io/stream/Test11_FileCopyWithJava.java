package com.io.stream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Test11_FileCopyWithJava {

	public static void main(String[] args) {
    try(FileReader fr =new FileReader("abc.txt");
    	FileWriter  fw=new FileWriter("bbc.txt"))
    {
     fr.transferTo(fw);
    System.out.println("file copied");
    }
    catch(Exception e) {
    e.printStackTrace();	
    }
	}
}
