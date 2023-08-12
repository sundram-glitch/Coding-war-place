package com.sd.it;
class  Protected_Exe_level_modifier_Tester{
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=-40;
	public static void main(String[] args){
		System.out.println("start of main !");
	Protected_Exe_level_modifier_Tester pro1=new Protected_Exe_level_modifier_Tester();
	System.out.println("value of a:"+pro1.a+"value of b:"+pro1.b+"value of c:"+pro1.c+"value of d:"+pro1.d);
	/*Protected_Exe_level_modifier_Tester_User pro1=new Protected_Exe_level_modifier_Tester_User();
	pro1.m1();*/
		System.out.println("end of main !");
	}
}

class Protected_Exe_level_modifier_Tester_User extends Protected_Exe_level_modifier_Tester{
 
 void m1(){
 	Protected_Exe_level_modifier_Tester pro=new Protected_Exe_level_modifier_Tester();
	System.out.println(/*"value of a:"+pro.a+*/"value of b:"+pro.b+"value of c:"+pro.c+"value of d:"+pro.d);
	Protected_Exe_level_modifier_Tester_User pro2=new Protected_Exe_level_modifier_Tester_User();
    System.out.println(/*"value of a:"+pro2a+*/"value of b:"+pro2.b+"value of c:"+pro2.c+"value of d:"+pro2.d);
 }
public static void main(String[] args){
	Protected_Exe_level_modifier_Tester_User p=new  Protected_Exe_level_modifier_Tester_User();
	p.m1();
}
}