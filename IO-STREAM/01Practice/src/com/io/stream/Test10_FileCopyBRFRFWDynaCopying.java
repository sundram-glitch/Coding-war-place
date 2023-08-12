package com.io.stream;

import java.util.Scanner;

import com.custom.exception.IOOperationExcepion;
import com.ios.FileCopy.FileCopy;

public class Test10_FileCopyBRFRFWDynaCopying {
	public static void main(String[] args) throws IOOperationExcepion {
    Scanner scanOf=new Scanner(System.in);
	    System.out.println("Enter srcfile name");
	    String srcFile=scanOf.next();
	    System.out.println("Enter destfile name");
	    String destFile=scanOf.next();
    try {
       	FileCopy.Filecp(srcFile,destFile);
    }
    catch(Exception e) {
    	String errMessage=e.getMessage();
    	if(errMessage.contains(srcFile))
    System.err.println(srcFile+" is not available");
    	else if(errMessage.contains(destFile))
    		System.err.println(destFile+" is not accessible");
    	else
    		System.err.println("Connection not available");
    }
	}
}