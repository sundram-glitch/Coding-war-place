class B02 { 
	int x=m1();
	{
		System.out.println("NSB");
	}
	int m1(){
		System.out.println("m1:x");
		return 5;
	}
	B02(){
		this(10);
		x=15;
	}
	B02(int a){
		this("abc");
		x=a;
	}
	/*B01(Integer io){
	 x=io.intValue();
	}*/
	B02(String s){
		x=70;
	//	x=Integer.parseInt(s);
	System.out.println("String args constructor");

	}
public static void main(String[]args){
	//A01 a=new A01();
	B02 a1=new B02();
	B02 b=new B02(10); 
	B02 b1=new B02("7"); 
	
	System.out.println("a.X"+b1.x);
	System.out.println("a1.X"+a1.x);
	System.out.println("b.X"+b.x);
      }
   }