class Setter_Getter_Method_Call{

	public static void main(String[] args){
	System.out.println("Start of main");
    Setter_Getter_Method sgm=new Setter_Getter_Method();
	sgm.display();
	sgm.setEmpname("Sundram");
	sgm.setEmpno(40);
	sgm.setEmpdept("Team Leader");
	sgm.setEmpsal(45000);
	System.out.println("Empsal before increament:-"+sgm.getEmpsal());
	sgm.setEmpsal(sgm.getEmpsal()+sgm.getEmpsal()*25/100);
	sgm.display();
	System.out.println("Empname:-"+sgm.getEmpname());
	System.out.println("Empno:-"+sgm.getEmpno());
	System.out.println("Empdept:-"+sgm.getEmpdept());
	System.out.println("Empsal after increament by 25%:-"+sgm.getEmpsal());
	System.out.println("end's main!");
    }

}
