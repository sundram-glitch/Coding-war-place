package com.ios.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


import com.ios.bean.BankAccount;
//static var and transient var does not participate in serializations
public class Test_ReadingObject_Desrialization {
public static void main(String[] args) throws ClassNotFoundException, IOException {
	ObjectInputStream ois= new ObjectInputStream(new FileInputStream("accountInfo.ser"));
    BankAccount acc=(BankAccount)ois.readObject();
    System.out.println(acc);
}
}
