package com.sd.sh.methods;

public class Test05_05_RefVarImmutable {

	public static void main(String[] args) {
    String s1 = "a";
    s1="b";
    s1=s1.concat("mman");
    System.out.println(s1);
	}
}
