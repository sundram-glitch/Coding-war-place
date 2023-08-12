class B01 extends A01{ 
	int x;
	B01(){
		this(10);
	}
	B01(int a){
		x=a;
	}
	B01(Integer io){
	 x=io.intValue();
	}
	B01(String s){
		x=Integer.parseInt(s);
			System.out.println("X"+x);

	}
public static void main(String[]args){
	A01 a=new A01();
	A01 a1=new B01();
	B01 b=new B01(new Integer(6)); 
	B01 b1=new B01("7"); 
	
	System.out.println("a.X"+a.x);
	System.out.println("a1.X"+a1.x);
	System.out.println("b.X"+b.x);
      }
   }