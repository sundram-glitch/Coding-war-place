package com.sd.sh.methods;
//java 8 v
//public static String join(String delimeter,CharSequebce..cs)
//public static String join(String delimeter delimeter,Iterable<? extends CharSequence> iterable) 
public class Test11_Join {

	public static void main(String[] args) {
    String str = "SunddramDubey";
    str = String.join(" ",str );
		String s1=String.join("-","a","b","c","d"); System.out.println("s1:\t"+s1);
	String s2=String.join("","a","b","c","d"); System.out.println("s2:\t"+s2);
	String s3=String.join("-"); System.out.println("s3:\t"+s3);
	String s4=String.join("-","a"); System.out.println("s4:\t"+s4);
	String s5=String.join("-","a","b");System.out.println("s5:\t"+s5);
	String s6=String.join("-","a",new StringBuffer("b"),new StringBuilder("c"));
	System.out.println("s6:\t"+s6);
	String s7=String.join("-",null,"b");
	System.out.println("s7:\t"+s7);
	String s8=String.join("-","a",null,"b");
	System.out.println(s8);
    //String s9=String.join("-",null,0,"a");
    //String s9=String.join("-",null);
	String s10=String.join(":::",new String[] {"1","2","3"});
	System.out.println(s10);
	String s11=String.join(":::",new StringBuffer[] {new StringBuffer("m"),new StringBuffer("n")});
    System.out.println(s11);
	System.out.println();
	/*List<String> list=List.of("p","q","r");
	String s12=String.join("/","p","q","r");*/
	}
}
