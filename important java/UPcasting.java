class Person{
 int a=11;
 static int b=22;
 void m1(){
 System.out.println("super-class non-static m1 method");
 }
 static void m2(){
	 System.out.println("super-class static m2 method");
     }
}
class Student extends Person{
   int a=33;
   static int b=44;
      void m3(){
	   System.out.println("sub-class non-static m3 method");
   }
   static void m4(){
	   System.out.println("sub-class static m4 method");
   }
}
class Test${
	public static void main(String[]args){
		Person p1=new Person();
		System.out.println("------------------------------------------");
		System.out.println(p1.a);
        System.out.println(p1.b);
		p1.m1();
		p1.m2();
		System.out.println("----------------------------------");
		
		System.out.println("------------------------------------");
        Person p2=new Student();
 		System.out.println("------------------------------------------");
		System.out.println(p2.a);
        System.out.println(p2.b);
		p2.m1();
		p2.m2();
		System.out.println("------------------------------------------");
		Student s1=new Student();
		System.out.println("------------------------------------");
		System.out.println(s1.a);
		System.out.println(s1.b);
		s1.m3();
		s1.m4();
		s1.m1();
		s1.m2();
        Person p3=(Person) s1();
 		System.out.println("------------------------------------------");
		System.out.println(p3.a);
        System.out.println(p3.b);
		p3.m1();
		p3.m2();
		p3.m3();
		p3.m4();
       	}
}