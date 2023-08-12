class Dangling 
{
	   int a;;
       int b;

	  static void m1(){
	//Dangling.a=	b ;  //o/p a=0,a=0,x=0,a=0             
		 // a=x; //o/p/*a:0,a:50,x:50,a:50*/
             a=94;
		    b=8923;
                        
                        

      // System.out.println("b"+a);
	  
	  //System.out.println("c"+a);
	  }
	public static void main(String[] args) 
	{
		//Dangling d1=new Dangling();
		
		System.out.println(a+"-"+b);
        // d1.m1(50);
        System.out.println();
		m1();
		System.out.println(a+"-"+b);
        // d1.m1(50);
        System.out.println();
		
	}
}
