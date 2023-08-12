class Student_1{
int sno;
String sname;
double fee;
String course;

}
class Example
{
	static void m1(){
		Public p1=new Public();
		p1.sno=40;
		p1.sname="sundram";
		p1.course="java";
		p1.fee=1000;
		System.out.println("student no"+p1.sno+"Student Name"+p1.sname+"Student Course"+p1.course+"Student Fee"+p1.fee);
  }
		static void   m2(){
			Public p2=new Public();
		p2.sno=40;
		p2.sname="sundram";
		p2.course="java";
		p2.fee=1000;
		System.out.println("student no"+p2.sno+"Student Name"+p2.sname+"Student Course"+p2.course+"Student Fee"+p2.fee);
			
   }

}
class Test
{
	public static strictfp synchronized final void main(String... args){
	//	m1();
   //	m2();
   // Example e1=new Example();
      Public p4=new Public();
	  p4=Example.m1();
      Example.m1();
	  Example.m2();
	       //  p4.m2();
			// p4.m1();
	       Example.m1();
		   Example.m2();
		   System.out.println(Example.m2());

   }

}