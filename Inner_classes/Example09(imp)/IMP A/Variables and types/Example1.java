class Example1 
{ 
	 int a=20;

     static class Java
      {
      
        static void m1(){
		int p=10;
		System.out.println("p"+p);
		//m2();
	}
 	     void m2(){
    int q=40;
		   System.out.println("q"+q);
		   Example1 e=new Example1();
		   System.out.println("A"+e.a);

	}//method is closed
	  }//inner class is closed
	  
	public static void main(String[] args) 
	{
		Java j=new Java();
		j.m2();
		Java.m1();
		System.out.println("Hello World!");
	}

}
