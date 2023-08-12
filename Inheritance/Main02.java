class A{
static void m1(){
 System.out.println("A m1");
}
static void m4(){
 System.out.println("A m4");
}
void m2(){
 System.out.println("A m2");
     m1();
 }
}
class B extends A{
 /*void m1(){
 System.out.println("B m1");
 }*/
 void m3(){
 System.out.println("B m3");
     m1();
 super.m2();
 }
}
class C extends B{
static void m1(){
 System.out.println("C m1");
    m4();
 }
  void m2(){
 System.out.println("C m2");
 }
}
class D extends C{
/*void m1(){
 System.out.println("D m1");
 }*/
 void m2(){
 System.out.println("D m2");
 }
static void m4(){
 System.out.println("D m4");
 }
}
class Main02{
	public static void main(String[] args){
		System.out.println("Hello World!");
		D  d=new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}
