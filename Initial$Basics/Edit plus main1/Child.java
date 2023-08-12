class Child{
	Student s1=new Student();
    s1.sno=101;
	s1.sname="Sundram";
	s1.course="CORE JAVA";
	s1.fee=1000
    System.out.println(s1.sno);
	 System.out.println(s1.sname);
	 System.out.println(s1.course);
	 System.out.println(s1.fee);
	
}
 static Student m2(){
	 Student s2=new Student();
	    s2.sno=102;
		s2.sname="DUBEY";
		s2.course="C@";
		s2.fee=1500;
		return s2;
   }
   }