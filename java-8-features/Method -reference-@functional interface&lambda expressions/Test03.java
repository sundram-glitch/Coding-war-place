@FunctionalInterface
interface Example{
	void m1();
}

class Sample{
	void bbc(){
    System.out.println("Sample BBC");
	}
	void cbc(){
	System.out.println("Sample cbc");
	}

};
class Test03 extends Sample{
   static void abc(){
	System.out.println("Test class abc");
}
    void bbc(){
	System.out.println("Test class bbc");
	}

	public static void main(String[] args){
	Example e1=Test03::abc;//Example e6=this::abc;
    e1.m1();

	Example e2=new Test03()::bbc;
	e2.m1();

	Test03 t1=new Test03();
	t1.xyz();
	System.out.println("Hello World!");
	}

	void xyz(){
	Example e3=Test03::abc;
	Example e4=new Test03()::bbc;
	Example e5=this::bbc;
    //Example e6=this::abc;
    
	Example e7=super::bbc;
	//Example e8=this.cbc;
	Example e8=super::cbc;
    e3.m1();
	e4.m1();
	e5.m1();
    //e6.m1();
    e7.m1();
	e8.m1();
    }
}
