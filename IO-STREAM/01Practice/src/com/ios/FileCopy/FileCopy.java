package com.ios.FileCopy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.custom.exception.IOOperationExcepion;

public class FileCopy {
	public static void Filecp(String srcFile,String destFile) throws IOOperationExcepion {
	try(BufferedReader br=new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(destFile)))	{
		while(br.ready()) 
			bw.write(br.readLine()+"\n");
		System.out.println("file data copied");
	}
	catch(FileNotFoundException e) {
	throw new  IOOperationExcepion(e);
	}
	catch(IOException e) {
		throw new IOOperationExcepion(e);
	}
	}
}