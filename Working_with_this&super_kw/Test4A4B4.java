import java.util.Scanner;
class A4 {
	int x=10;
    int y=20;

     
	A4(){
      System.out.println("inside A4 CONS:");
	 }
}

 class B4 extends A4{
  static Scanner scn=new Scanner(System.in);
	 {
	 System.out.println("ent values for b4 cls int x:");
	 }
	 B4(){
      System.out.println("inside B4 CONS:");
	 }
	 int x=scn.nextInt();
	 int y=40;
 }

public class Test4A4B4{
 public static void main(String...args){
 B4 b1 =new B4();
 B4 b2 =new B4();
 A4 a1=new A4();
 A4 a2=new A4();
 System.out.println("b1.x:"+b1.x+" b1.y:"+b1.y);
 System.out.println("a1.x:"+a1.x+" a1.y"+a1.y);
 b1.x=5;
 a1.x=6;
 System.out.println("b1.x:"+b1.x+" b1.y"+b1.y);
 System.out.println("a1.x:"+a1.x+" a1.y"+a1.y);
 System.out.println("");
 System.out.println("b2.x:"+b2.x+" b2.y"+b2.y);
 System.out.println("a2.x:"+a2.x+" a2.y"+a2.y);
 } 
} 
 