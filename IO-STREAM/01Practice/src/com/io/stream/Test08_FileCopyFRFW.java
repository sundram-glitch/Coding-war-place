package com.io.stream;

import java.io.FileReader;
import java.io.FileWriter;

public class Test08_FileCopyFRFW{

		public static void main(String[] args) {
	    try(FileReader fis=new FileReader("abc.txt");
	    FileWriter fos=new FileWriter("bbc.txt"))
	    {
	    	int data;
	    	while((data=fis.read())!=-1) {
	    		fos.write(data);
	    	}
	    	System.out.println("file data copied");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
		}

	}

