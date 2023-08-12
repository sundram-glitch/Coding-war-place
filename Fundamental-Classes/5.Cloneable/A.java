//protected native Object clone() throws CloneNotSupportedException

class A implements Cloneable{  
	
	int x;
	
	A(){
		System.out.println("Constructor");
    }//once

	public static void main(String[]args)throws CloneNotSupportedException{
	
	A a1=new A();
	  a1.x=15;
	A a2=(A)a1.clone();
	/*Internal Logic :-
	A a2=new A();*/
	a2.x=1;
	//something like this.
	
	System.out.println(a1==a2);//1010==2020
    System.out.println();
	System.out.println(a1.x);
	System.out.println(a2.x);
	}	
}