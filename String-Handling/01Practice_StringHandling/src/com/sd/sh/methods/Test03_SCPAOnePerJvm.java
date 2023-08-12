package com.sd.sh.methods;

class A{
	static String s1="a";
}

class B{
	static String s2="a";  
}

public class Test03_SCPAOnePerJvm {
public static void main(String[] args) {
	System.out.println(A.s1==B.s2);
}  
}
