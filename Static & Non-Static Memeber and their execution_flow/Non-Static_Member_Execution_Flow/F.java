//non-static member execution flow 
//single enough hahaha
class F{
	int x=10;
	{
	System.out.println("NSB-1 start");
  	System.out.println("NSB-1 value x :"+x);
	//F f=new F();//recursive
	//System.out.println("NSB-1 values y:"+f.y);//cursor not at all giving chance to come here 
	//System.out.println("NSB-1 values y:"+y);//illegal forward reference
	y=23;
	//System.out.println("NSB-1 value y:"+y);//illegal forward reference
	System.out.println("end of NSB-1 ");
	}
	F(){
	//any how 1st it'll call non-static block then only it'll going to initialize...
    System.out.println("N-PC");
	}
	void m1(){
	System.out.println("M1 method");
	System.out.println("Y:-"+y);
	System.out.println("x:-"+x);
	}
	int y=19;
	{
	System.out.println("NSB-1 start");
  	System.out.println("NSB-1 value x :"+x);
	System.out.println("NSB-1 values y:"+y);
	y=23;
	System.out.println("NSB-1 value y:"+y);
	System.out.println("end of NSB-1 ");
	}
	public static void main(String[] args){
	System.out.println("in main!");
	//System.out.println("Values y:"+y); nsv cannt ref from sc...
	F f=new F();
	System.out.println("Values y:"+f.y);
	f.m1();
	}
}
