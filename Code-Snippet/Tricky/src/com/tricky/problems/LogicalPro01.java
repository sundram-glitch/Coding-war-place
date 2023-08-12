package com.tricky.problems;

public class LogicalPro01 {

	public static void main(String args[])
	{
	int num=4;
	int temp=num;
	for(int i=0;i<=num;i++){
		
	for(int k=1;k<=temp;k++)
	System.out.print(1);
	
	if(i!=0)
	System.out.print(2);
	
	if(i==4)
	System.out.print(2);
	
	System.out.println();
	temp--;
	}
	}
}
