class Employee {
	int    eno;
	String ename;
	String edept;
	double esal;
	Employee(){
           eno=420;
	       ename="Aman";
	       edept="Gribbers";
	       esal=2;
	}
	Employee(int    eno,String ename,String edept,double esal){
	this.eno=eno;
	this.ename=ename;
	this.edept=edept;
	this.esal=esal;
	}
	Employee(Employee e){
		
		this.ename=e.ename;
		this.eno=e.eno;
		this.edept=e.edept;
		this.esal=e.esal;}
	void display(){
		System.out.println("eno\t"+eno);
		System.out.println("ename\t"+ename);
		System.out.println("edept\t"+edept);
		System.out.println("esal\t"+esal);
	}
	public static void main(String [] args){
		Employee e1=new Employee();
		Employee e2=new Employee(360,"Sundram",
		"java developer",9000000);
		Employee e3=new Employee(e1);
		e1.display();
		e2.display();
		e3.display();
	}
}
