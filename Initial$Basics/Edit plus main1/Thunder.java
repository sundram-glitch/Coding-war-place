class  Thunder

{
	  
	  static int a=m1();
	   
	   static int m1(){
		   return 20;
	   }

        static int b=m1();
		static int m2(){
			System.out.println("variable b is declared");
			return 10;
		}

	public static void main(String[] args) 
	{
		System.out.println("a!"+a);
		System.out.println("b:"+b); 

	}
}
