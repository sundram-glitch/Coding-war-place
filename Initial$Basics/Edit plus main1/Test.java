class Test{

	      public static void m1(String... args){
		      System.out.println("m1");
			  m2();
		   }
		   static void m2(){
			   System.out.println("m2");
			   m1();
     }
	
  }