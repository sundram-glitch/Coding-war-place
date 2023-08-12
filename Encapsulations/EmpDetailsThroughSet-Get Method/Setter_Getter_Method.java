class  Setter_Getter_Method{
	 private String Empname;
	 private int Empno;
	 private String Empdept;
	 private double Empsal;

	 public void setEmpname(String Empname){
	 this.Empname=Empname;
	 }
	 public String getEmpname(){
	 return Empname;
	 }

	 public void setEmpno(int Empno){
	 this.Empno=Empno;
	 }
	 public int getEmpno(){
	 return Empno;
	 }

	 public void setEmpdept(String Empdept){
	 this.Empdept=Empdept;
	 }
	 public String getEmpdept(){
	 return Empdept;
	 }

	 public void setEmpsal(double Empsal){
	 this.Empsal=Empsal;
	 }
	 public double getEmpsal(){
	 return Empsal;
	 }
	 public void display(){
	 System.out.println("Inside display method");
	 System.out.println("Empname:-"+Empname);
	 System.out.println("Empno:-"+Empno);
	 System.out.println("Empdept:-"+Empdept);
	 System.out.println("Empsal:-"+Empsal);
     System.out.println("end's Inside display method");
	 }
}
