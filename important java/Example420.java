class Example420{
	

    /*  Example420(){
   System.out.println("Example zero-param1");
	  }*/
	  Example420(int a){
		  System.out.println("Example int-param1");
	  }
}
class Sample420 extends Example420{
     
	 /*Sample420(){
	 System.out.println("Sample zero-param2");
	 }*/
     Sample420(int a){
		// super(2324);
		 System.out.println("Sample int-param2");
	 }

	public static void main(String[] args) 
	{
        // Sample420 s1=new Sample420();
         Sample420 s2=new Sample420(10);
		System.out.println("------------------------");
	}
}

