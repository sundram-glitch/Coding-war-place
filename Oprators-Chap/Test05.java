import java.util.Scanner;
   public class Test05{
   public static void main(String[] args){
   Scanner scanof=new Scanner(System.in);
   final Integer i = scanof.nextInt();
   final Integer j = scanof.nextInt();
//if not in rang of -128 To 127 new References will create
if(i==j){
switch(i){
case 1: System.out.println("three"); break;
//\u000dcase 127://\u000d  System.out.println("127"); // unicode :- newLine \u000d break;
default: System.out.println("other"); break;
   }
  }
 }
//https://ide.geeksforgeeks.org/eBtlVRRsUO