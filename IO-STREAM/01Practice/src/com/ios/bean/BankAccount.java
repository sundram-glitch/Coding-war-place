package com.ios.bean;

import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

import com.ios.helper.AccTypeMap;
//Serialzable is marker interface
public class BankAccount implements Comparable<BankAccount>,Serializable{
private static String BankName;
private static String BranchName;
private static String Ifsc;

private long accNum;
private String accHName;
private int balance;
transient private String username;
transient private String password;
private String accType;

@Override
public String toString() {
  StringBuilder sb=new StringBuilder();
  sb.append("\n BankName\t:"+BankName);
  sb.append("\n BranchName\t:"+BranchName);
  sb.append("\n IFSC\t\t:"+Ifsc);
  sb.append("\n accNum\t:"+accNum);
  sb.append("\n accHName\t:"+accHName);
  sb.append("\n balance\t\t:"+balance);
  sb.append("\n username\t\t:"+username);
  sb.append("\n password\t\t:"+password);
  sb.append("\n accType\t\t:"+accType);
  return sb.toString();
}
@Override
	public int hashCode() {
		return AccTypeMap.getAccTypeID(accType);
	}
@Override
	public boolean equals(Object obj) {
    if(obj instanceof BankAccount) {
    	BankAccount acc=(BankAccount) obj;
    	return this.accType.equals(acc.accType)
    			&&this.accNum==acc.accNum;
    }
    return false;
}
@Override
	public int compareTo(BankAccount acc) {
    int accTypeDiff=AccTypeMap.getAccTypeID(this.accType)-AccTypeMap.getAccTypeID(acc.accType);
    if(accTypeDiff==0) {
    	long accNumDiff=this.accNum-acc.accNum;
    if(accNumDiff<0) {
    	return -1;
    }
    else if(accNumDiff>0) {
    	return 1;
    }
    else {
    	return 0;
    }
    }
	return accTypeDiff;
}
static {
	System.out.println("BankAccount SB executed");
	try (
			//BufferedReader 	br = new BufferedReader(new FileReader("bankdetails.txt"))
			FileReader reader=new FileReader("bankdetails.properties")
			)
		{
		Properties pros=new Properties();
		pros.load(reader);
		/*
		 * BankName=br.readLine(); BranchName=br.readLine(); Ifsc=br.readLine();
		 */	
		BankName=pros.getProperty("BANK_NAME");
		BranchName=pros.getProperty("BRANCH_NAME");
		Ifsc=pros.getProperty("IFSC");
	
		} catch (IOException e) {
		e.printStackTrace();
	}//t/c
}//static
public BankAccount() {
	System.out.println("no param cons executed");
}
public static String getBankName() {
	return BankName;
}
public static void setBankName(String bankName) {
	BankName = bankName;
}
public static String getBranchName() {
	return BranchName;
}
public static void setBranchName(String branchName) {
	BranchName = branchName;
}
public static String getIfsc() {
	return Ifsc;
}
public static void setIfsc(String ifsc) {
	Ifsc = ifsc;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
public long getAccNum() {
	return accNum;
}
public void setAccNum(int accNum) {
	this.accNum = accNum;
}
public String getAccHName() {
	return accHName;
}
public void setAccHName(String accHName) {
	this.accHName = accHName;
}
public int getBalance() {
	return balance;
}
public void setBalance(int i) {
	this.balance = i;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
