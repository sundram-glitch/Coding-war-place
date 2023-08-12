package com.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test07_FileCopyFisToFos {

	public static void main(String[] args) {
    try(FileInputStream fis=new FileInputStream("abc.txt");
    FileOutputStream fos=new FileOutputStream("bbc.txt"))
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
