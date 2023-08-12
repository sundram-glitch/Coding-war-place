class  Employee2
{

     int eno;
     String ename;
	 double sal;
	  
     public void setEno(int enu){
		     eno=enu;
	}
	   public int getEno(){
		   return eno;
	   }
	   public void setEname(String emname){
                ename=emname;
	   }
	   public String getEname(){
		   return ename;
	   }
 
	public  void setSal(double esal){
		     sal=esal;
	}
		public double getSal(){
			return sal;
		}

		public void display(){

		System.out.println("eno:"+eno);
		System.out.println("ename:"+ename);
		System.out.println("sal:"+sal);
	}
}
