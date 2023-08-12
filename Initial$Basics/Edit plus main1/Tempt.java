class Tempt
{
	 int a=10;
    int b=20
		
	
	;

	 void set(int a,int b){
		 a=a;
		 b=b;
	 }
	 void display(){
		 System.out.println(a);
		 System.out.println(b);
	 }
	  
	   public static void main(String[]args){
		   Tempt t1=new Tempt();
		   Tempt t2=new Tempt();
		    
			t1.set(98,8937);
			t1.display();

			t2.set(938,987);
			t2.display();
	   }
}

