package com.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;


public class Test02_WrittingDataToFileUsing_FOS {

	public static void main(String[] args) throws IOException {
	final String FileName="bbc.txt";
    //FileOutputStream fos=new FileOutputStream(FileName);
    //FileOutputStream fos=new FileOutputStream("C:\\bbb.txt");
	//readonly state change privileges
	FileOutputStream fos=new FileOutputStream(FileName,true);
    String data=" Dubey";
    fos.write(data.getBytes());
    System.out.println("data saved");
	//fos.flush();
	fos.close();
  }
}
