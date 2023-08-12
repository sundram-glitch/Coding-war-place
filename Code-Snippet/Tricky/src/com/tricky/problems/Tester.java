package com.tricky.problems;

import java.util.Scanner;

class People{
    String composition;
    long PatienceId;
    String Bi;
	public People(String v, long id, String bi) {
    this.composition=v;
    this.PatienceId=id;
    this.Bi=bi;
	if(bi.contains("ravus")) 
		System.out.println(" POSITIVE");
	else
		System.out.println("NEGETIVE");
	}
}
public class Tester{
	public static void main(String[] args) {
	Scanner scanf=new Scanner(System.in);
	System.out.println("coronavirus");
    int n=scanf.nextInt();
    for (int i = 1; i <=n; i++) {
    String v=scanf.next();
    long id=scanf.nextLong();
    String bi=scanf.next();
		new People(v, id, bi);
	}
	/*
	 * People people01=new People("coronavirus", 0443l, "crnas"); People
	 * people02=new People("coronavirus",01161L,"ravus"); People people03=new
	 * People("coronavirus", 9879L, "onarous");
	 */	
}
}