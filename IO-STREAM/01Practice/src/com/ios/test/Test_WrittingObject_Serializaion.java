package com.ios.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.ios.bean.BankAccount;

public class Test_WrittingObject_Serializaion {

	public static void main(String[] args) throws FileNotFoundException, IOException {
    BankAccount acc1=new BankAccount();
    System.out.println(acc1);
    acc1.setBankName("PAYTM");
    acc1.setBranchName("SRNAGAR");
    acc1.setIfsc("Paytm123");
	acc1.setAccNum(1234);
	acc1.setAccHName("Sundram");
	acc1.setBalance(1000000);
	acc1.setUsername("@SundramKTM");
	acc1.setPassword("@fE56BHI6");
	acc1.setAccType("Saving");
	System.out.println(acc1);
	System.out.println("Serialization stated");
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("accountInfo.ser"));
	oos.writeObject(acc1);
	System.out.println("Serialization end ");
	System.out.println("acc object state is saved in file successfully");
	}

}
