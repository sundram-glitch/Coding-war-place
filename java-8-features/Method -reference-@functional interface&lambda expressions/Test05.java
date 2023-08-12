@FunctionalInterface
interface Example{
	void m1();
}
class Sample{
	void bbc(){
    System.out.println("Sample bbc");
	}
	void cbc(){
    System.out.println("Sample cbc");
	}
};

class  Test05 extends Sample{
    static void abc(){
    System.out.println("Test05 abc");
	}
	void bbc(){
    System.out.println("Test05 bbc");
	}
	public static void main(String[] args){
		System.out.println("Inside main!");
	Example e11=Test05::abc;//--->  
	Example e12=()->{Test05.abc();};
	e11.m1(); e12.m1();
	System.out.println();
    Example e21=new Test05()::bbc;     /*--->  we can not call sm 
	//Example e212= new Test05()::abc;using new class() ref in mr*/

	Example e22=()->{new Test05().abc();};/*both 
	Example e23=()->{new Test05().bbc();};allowed*/
	e21.m1(); e22.m1();
	e23.m1();
    System.out.println();
	Test05 t1=new Test05();
    t1.xyz();
	
	}
	void xyz(){ 
	Example e31=Test05::abc;
	Example e32=new Test05()::bbc;
	//Example e33=()->{this.bbc();};
	Example e33=this::bbc;
	//Example e34=this::abc;
	Example e34=super::bbc;
	Example e35=this::cbc;
	e33.m1(); e34.m1(); e35.m1();
	}
}
