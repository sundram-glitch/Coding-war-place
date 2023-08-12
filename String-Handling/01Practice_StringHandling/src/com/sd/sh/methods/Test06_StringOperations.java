/*String Operation
 * 1).Finding string is empty or not
 * 2).Finding string is spaces  string or not
 * 3).Finding string length
 * 4).Printing string characters
 */
package com.sd.sh.methods;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Iterator;

public class Test06_StringOperations {

       //public boolean isEpmpty()//1.6 -> only for emptyString -> s1.length==0?true:false
	   //public boolean isBlank();//11 -> both space and empty 
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	   String s1="";
       String s2=" ";
       System.out.println(s1.isEmpty());
       System.out.println(s2.isEmpty());
       System.out.println();
       
       String s3="abc";
       String s4=new String();
       String s5=new String("");
       String s6=new String(" ");
       String s7=new String("abc");
       String s8=" a";
       System.out.println(s3.isEmpty());       
       System.out.println(s4.isEmpty());
       System.out.println(s5.isEmpty());
       System.out.println(s6.trim().isEmpty()+" ye");
       System.out.println(s7.isEmpty());
       System.out.println();
       
       System.out.println(s2.trim().isEmpty());//up to Java 10v
       //System.out.println(s2.isBlank());//java 11v onwards
	   System.out.println(s8.isEmpty());
	   //System.out.println(s8.isBlank());
       System.out.println();
       
	   //public int length()
	   System.out.println("s1.len="+s1.length());
	   System.out.println(s2.length());
	   System.out.println(s3.length());
	   System.out.println();
	   
	   String[] sa = {"ab31","b","c"};
	   String   s9 ="a";
	   System.out.println("Arrays len ="+sa[0].length());
	   System.out.println(sa.length);
	   System.out.println(s9.length());
	   System.out.println();
	   
	   String s10="hari";
	   Example e1=new Example(5);
	   System.out.println("s10 "+s10);
	   System.out.println(e1);
	   System.out.println();
	   
       String s11;
       //System.out.println(s11.isEmpty());//-> where is obj ref? 
	   //System.out.println(s11.isBlank());-> """"
	   System.out.println();
	   
	   String s12 =null;
	   System.out.println(s12);//null check print null in String format
	   //System.out.println(s12.isEmpty());
	   //System.out.println(s12.isBlank());
	   //System.out.println(s12.length());
	   System.out.println();
	   
	   String s13="null";
       System.out.println("is "+s13.isEmpty());
       //System.out.println(s13.isBlank());
	   System.out.println(s13.length());
	   System.out.println();
	   
	   /*Scanner scanOf=new Scanner(System.in);
	   System.out.println("Enter Text");
	   String s14=scanOf.next();
	   System.out.println(s14.isEmpty());
	   //System.out.println(s14.isBlank());
	   System.out.println(s14.length());
	   System.out.println();*/
	   
	   //Get null via GET Post request
	   //String username=req.getParameter("s1");
	   String s15="hari";
	   System.out.println(s15=="hari");
       System.out.println(s15.equals("hari"));
       System.out.println();
       
       String s16=new String("hari");
       System.out.println(s16=="hari");
       System.out.println(s16.equals("hari"));
       System.out.println();
       
       String s17=new String("Hari");
       System.out.println(s17=="hari");
       System.out.println(s17.equals("hari"));
       System.out.println(s17.equalsIgnoreCase("hari"));
	   System.out.println();
	   
	   String s19="a";
	   String s20="a";
	   System.out.println("s19==s20\t ->"+(s19==s20));
	   System.out.println("s19==s20\ts19"==s20);
	   System.out.println("s19==s20"+s19==s20);
	   System.out.println();
	   
	   String s21="abc";
	   String s121=new String("abc");
	   StringBuffer sb1=new StringBuffer("abc");
	   StringBuilder sb2=new StringBuilder("abc");
	   System.out.println("i"+s21.equals(sb1));
	   System.out.println(s21.equals(sb2));
	   System.out.println(s21.equals(sb2.toString()));
	   System.out.println(s21.contentEquals(sb1));//1.4
	   System.out.println(s21.contentEquals(sb2));
	   System.out.println(s21.contentEquals(sb2));
	   System.out.println(s121.equals(s21));
	   System.out.println();
	   
	   StringBuffer sb3=new StringBuffer("abc");
	   System.out.println(sb1.equals(sb2));
	   System.out.println(sb1.equals(sb3));//In SBuffer Class toString() is not overriden
	   System.out.println();

	   String s22 = "abc";
	   String s23 = "abc";
	   String s24 = "aBc";
	   String s25 = "abcdef";
	   System.out.println();
	   System.out.println(s22==s23);
	   System.out.println(s22.equals(s23));
	   System.out.println(s22.compareTo(s23)+" lexico");
	   System.out.println(s22.equals(s24));
	   System.out.println(s22.compareTo(s24));//LexicoGraphically
	   System.out.println(s22.compareToIgnoreCase(s24));//LexicoGraphically
	   System.out.println(s22.equals(s25));
	   System.out.println(s22.compareTo(s25));
	   System.out.println(s22.compareToIgnoreCase(s25));//LexicoGraphically
       System.out.println(s25.equals(s22));
	   System.out.println(s25.compareTo(s22));
	   System.out.println(s25.compareTo(s22));
	   System.out.println(s25.compareToIgnoreCase(s22));
       System.out.println(s24.compareTo(s25));
       System.out.println(s24.compareTo(s25));
       System.out.println(s25.compareTo(s24));
       System.out.println(s25.compareToIgnoreCase(s24));
       System.out.println(s24.compareToIgnoreCase(s25));
       System.out.println();
                 //0123456789
       String s26="Java Programming Program";
	   System.out.println(s26.equals("Program"));
	   System.out.println(s26.compareTo("Program")+" heere");
	   
	   System.out.println(s26.contains("Program"));	
	   System.out.println(s26.contains("program"));
	   System.out.println(s26.toLowerCase().contains("program"));
	   //System.out.println(s26.contains('J'));
	   System.out.println(s26.contains("J"));
	   System.out.println();
	   
	   System.out.println(s26.indexOf("P"));
	   System.out.println(s26.lastIndexOf('a'));//most last possiblity
	   System.out.println(s26.lastIndexOf('a',5));//0-5 then 5 onward 'a' searchhing backward 
	   System.out.println(s26.indexOf('A'));	   
	   System.out.println(s26.lastIndexOf('A'));	   
	   System.out.println(s26.indexOf('a',-5));//-5 onward in ascending order
	   System.out.println(s26.lastIndexOf('a',-5));
	   System.out.println(s26.lastIndexOf('a',-5));//if(index<0) return -1;
	   System.out.println(s26.indexOf('a',27));//if(length>=lenth()) return -1;
	   System.out.println(s26.lastIndexOf('a',22)+"::");//if(index>length()) index=length-1
	   System.out.println(s26.indexOf('a',1));
	   System.out.println(s26.lastIndexOf('a',1));
	   System.out.println(s26.indexOf("Program"));
	   System.out.println(s26.lastIndexOf("Program"));
	   System.out.println();
	   
	   if(s26.toLowerCase().indexOf("Program")!=-1 | s26.indexOf("Program")>=0) {
		   System.out.println("available");
	   }
	   else {
		   System.out.println("not avail");
	   }
	   System.out.println();
	   
	   if(s26.contains("Program")) {
		   System.out.println("available");
	   }
	   else {
		   System.out.println("no available");
	   }
	   System.out.println();
	   
	   String s27 = "abc bbc cbc";
	   System.out.println(s27.equals("abc"));
	   System.out.println("abc".contains(s27));
	   System.out.println("abc".compareTo(s27));
	   System.out.println(s27.contains("abc"));
	   System.out.println(s27.compareTo("abc"));//character by character
       System.out.println(s27.indexOf("bbc"));
       System.out.println("abc bbc bbc".indexOf(s27));
	   
       System.out.println(s27.startsWith("abc"));
	   System.out.println(s27.endsWith("cbc"));
	   System.out.println();
	   
	   String s28="hari krishna";
	   String[] strAr2 = {"Ani", "Sam", " Joe"};
	   	 
	   System.out.println(s28.length());
	   System.out.println(s28.charAt(0));
	   System.out.println(s28.charAt(1));
	   //System.out.println(s28.charAt(12)); //S A E 
	   //System.out.println(s28.charAt(-1));//  ''
       	int i;
       	/*for(i=0; i<=s28.length();i++) 
       	for(i=0; i<s28.length();i++) {
	    System.out.println(s28.charAt(i));*/
       	for (int i1 = s28.length()-1; i1 >=0; i1--) 
       		System.out.print(s28.charAt(i1));
        System.out.println();
       
		  for (String string : strAr2)System.out.println(string);
		 
        String [] s29 = new String[7];
        s29[0]="a"; s29[1]="i";
        Arrays.fill(s29, 2,7, "sundram");
        for (String string : s29)
			System.out.println(string+" ..................");
        System.out.println();
        
        String s30 = "Sundram Lala Dubey";
        System.out.println(s30.substring(7));
        System.out.println(s30.substring(7,11));
        //System.out.println(s30.substring(-5,10));
        //System.out.println(s30.substring(5, -10));
        System.out.println(s30.substring(5,5));
        System.out.println(s30.substring(5,5).equals(""));
        System.out.println(s30.substring(7,7).isEmpty());
        System.out.println(s30.substring(5,7).isEmpty());
        System.out.println();
        
        /*Scanner scanOf=new Scanner(System.in);
        System.out.println("Enter text");
        String s31=scanOf.next();
        String s32=s31.toLowerCase();
        System.out.println(s32);
		
		  if(s32.contains("hari")) { 
			  int start = s32.indexOf("hari"); 
			  int end =start+4; 
			  String hari = s31.substring(start,end);
		  System.out.println(hari+" is available");
		  System.out.println();
		  } else
		  System.out.println("hari is not available");
		  */        
        System.out.println();
        
        String s33="hari,balayya,pawankalayan";
        String[] s34=s33.split(",",0);
        System.out.println(s34.length);
        System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s34)+" sdfdf");
	    System.out.println();
	    int j;
	    for (j = s34.length-1; j >=0; j--) {
	    	if(j!=0)
	    	System.out.print(s34[j].concat(".")); 
	    }
	    System.out.print(s34[0]);
        String[] s35=s33.split("a");
        System.out.println(s35.length);
        //System.out.println(s35[1]);
        System.out.println(java.util.Arrays.toString(s35));
	    System.out.println();
	    
        String[] s36=s33.split("1");
        System.out.println(s36.length+" o");
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s36));
	    System.out.println();
	    
        String[] s37=s33.split("hari,balayya,pawankalayan");
        System.out.println(s37.length);
        //System.out.println(s37[1]);
        System.out.println(java.util.Arrays.toString(s37));
	    System.out.println();
	    
	    String[] s38=s33.split("h");
        System.out.println(s38.length);
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s38));
	    System.out.println();
	    
	    String[] s39=s33.split("n");
        System.out.println(s39.length);
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s39));
	    System.out.println();
	    
	    String s40="abc abc abc bbc";
	    String[] s41=s40.split("a");
        System.out.println(s41.length);
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s41));
	    System.out.println();
	    
	    String[] s42=s40.split("c");
        System.out.println(s42.length);
        System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s42));
	    System.out.println();
	 
	    String[] s43=s40.split("abc");
        System.out.println(s43.length);
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s43));
	    System.out.println();
	   
	    String[] s44=s40.split(" abc");//First token found then deleter removed again delemeter found left no toke right side there so space added left side
	    System.out.println(s44.length);
	    //System.out.println(s34[1]);
	    System.out.println(java.util.Arrays.toString(s44));
	    System.out.println();
	    
	    String[] s45=s40.split(" ");
        System.out.println(s45.length);
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s45));
	    System.out.println();
	    
	    String[] s46=s40.split("aaa");//not found direct 1 complete token-
        System.out.println(s46.length);
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s46));
	    System.out.println();
	    
	    String s47="aaaaaab";
	    String[] s48=s47.split("a");
        System.out.println(s48.length);
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s48));
	    System.out.println();
	    
	    String s49="abc.txt.";
	    String[] s50=s49.split("\\.");
        System.out.println(s50.length);
        //System.out.println(s34[1]);
        System.out.println(java.util.Arrays.toString(s50));
	   
		 String s51="abc.txt";
		 String[] s52=s51.split("\\.");//very imp
		 System.out.println(s52.length); //System.out.println(s34[1]);
		 System.out.println(java.util.Arrays.toString(s52));
		 //System.out.println();
		 
	    
	    String sa51 = "a1b2c3am";
	    String[] sa52=sa51.split("[abc]");
	    System.out.println(sa52.length);
	    System.out.println(java.util.Arrays.toString(sa52));
	    System.out.println();
        System.out.println();
        
	    String s53 = "a1b2c3";
	    String[] s54=s53.split("123");
	    System.out.println(s54.length);
	    System.out.println(java.util.Arrays.toString(s54));
	    System.out.println();
    
	    String s55 = "a1b2c3";
	    String[] s56=s55.split("[123]");
	    System.out.println(s56.length);
	    System.out.println(java.util.Arrays.toString(s56));
	    System.out.println();
	    
	    String s57 = "a1b2c3";
	    String[] s58=s57.split("[a-z]");
	    System.out.println(s58.length);
	    System.out.println(java.util.Arrays.toString(s58));
	    System.out.println();
	    
	    String s59 = "a1b2c3";
	    String[] s60=s59.split("[0-9]");
	    System.out.println(s60.length);
	    System.out.println(java.util.Arrays.toString(s60));
	    System.out.println();
	    
	    String s61 = "a1b2c3";
	    String[] s62=s61.split("");
	    System.out.println(s62.length);
	    System.out.println(java.util.Arrays.toString(s62));
	    System.out.println();
	    
	    String s63="\"InfyTQ\"";
	    System.out.println(s63);
	    
	    String url="https://localhost:7318/loginservlet?usn=hk&pwd=sd";
        String[] urlarr=url.split("[?=&/]");
        System.out.println(urlarr[0 ]);
        System.out.println(Arrays.toString(urlarr));
	    System.out.println();
	    
	    String s64="abc";
	    char[] ch=s64.toCharArray();
	    byte[] b= s64.getBytes();
	    System.out.println(Arrays.toString(ch));
	    System.out.println(Arrays.toString(b));
        //m1(s64);
        //m1(char[]s64);
        //m2(s64);
	    //m2(byte[] s64);
	    
	    //m1(s64.toCharArray()); right
	    //m1(s64.getBytes());-->`right
	  
        int count=0;
	    String str="String";
	    try {
	    for (int i1 = 0;true;i1++) {
		   System.out.println(str.charAt(i1));
		 count++;
	    }
	    }
	    catch(Exception e) {}
	    System.out.println(count);
        
	System.out.println();
	Class<? extends String> clazz=s64.getClass();
	Field value=clazz.getDeclaredField("value");
	value.setAccessible(true);
	Object obj=(Object)value.get(s64);
	char[] ch1=(char[]) obj;
	System.out.println(ch1);

	StringTokenizer st=new StringTokenizer("Sundram Dubey");
	System.out.println(st.countTokens());
	System.out.println(st.toString());//toString() method not overridden 
	
	String t1=st.nextToken();
    String t2=st.nextToken();//again and again
    System.out.println(t1);
    System.out.println(t2);
    //two token only given which is already printed thats further hasMoreElement return false so nothing will be printed
    while(st.hasMoreElements()) {
    	String token=st.nextToken();
    	System.out.println(token);
    	System.out.println("hh");
    } 
    StringTokenizer sto=new StringTokenizer("Sundram Dubey","Su");
    while(sto.hasMoreElements()) {
    	System.out.print(sto.nextToken());
    }
    StringTokenizer stoo=new StringTokenizer("Sundram Dubey","u",true);
    while(stoo.hasMoreElements()) {
    	System.out.println(stoo.nextToken());
    }
    System.out.println(ch);
    
	}	
 }
