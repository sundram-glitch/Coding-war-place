//ek hi baat hai
class Student_Details{

 long enrollmentid;
 String Student_Name;
 String Branch;
 String Semester;
 String DOB;

	public static void main(String[] args){
		System.out.println("main start !");
	Student_Details sd=new Student_Details();
	sd.enrollmentid=16181040;
	sd.Student_Name="Sundram";
	sd.Branch="C.S.E";
	sd.DOB="04/05/2001";
    System.out.println("Enrollment id:"+sd.enrollmentid);
	System.out.println("Enrollment id:"+sd.Student_Name);
    System.out.println("Enrollment id:"+sd.Branch);
	System.out.println("Enrollment id:"+sd.DOB);
	}
}