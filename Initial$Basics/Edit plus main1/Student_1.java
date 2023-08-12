class Student_1{
int sno;
String sname;
double fee;
String course;

}
class Example
{
	static void m1(){
		Student_1 s1=new  Student_1();
		s1.sno=40;
		s1.sname="sundram";
		s1.course="java";
		s1.fee=1000;
		System.out.println("student no"+s1.sno+"Student Name"+s1.sname+"Student Course"+s1.course+"Student Fee"+s1.fee);
  }
		static String m2(){
			Student_1 s2=new Student_1();
		s2.sno=40;
		s2.sname="sundram";
		s2.course="java";
		s2.fee=1000;
		System.out.
			println("student no"+s2.sno+"Student Name"+s2.sname+"Student Course"+s2.course+"Student Fee"+s2.fee);
		return  "Sundram";
			
   }

}
class Test
{
	public static /*strictfp synchronized final*/ void main(String[] args){
	//	m1();
   //	m2();
   // Example e1=new Example();
      Student_1 s3=new Student_1();
	  Student_1 p4=new Student_1();
      Example.m1();
	  Example.m2();
	       //  p4.m2();
			// p4.m1();
	       Example.m1();
		   Example.m2();
		   System.out.println(Example.m2());

   }

}