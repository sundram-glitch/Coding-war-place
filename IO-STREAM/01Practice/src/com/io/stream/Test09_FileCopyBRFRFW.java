package com.io.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Test09_FileCopyBRFRFW {

	public static void main(String[] args) {
    try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
    	FileWriter fw=new FileWriter("bbc.txt"))
    {
    String line;
    while((line=br.readLine())!=null)
    fw.write(line+"\n");
    }
    catch(Exception e) {
    e.printStackTrace();
    }
	}
}