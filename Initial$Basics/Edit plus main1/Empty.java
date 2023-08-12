class Empty
{
	 int x=10;
	 int y=20;

	 void m1(){
     /*   Empty e1=new Empty();;*/
		 x=50;
		 y=60;
		/*System.out.println(e1.x+"......"+e1.y);
         e2.m1();
	  System.out.println(e1.x+"......"+e1.y); */
	 }
		 void m2(){

	  System.out.println(x+"......"+y);
}

        void m3(){
m2();
			 m1();
			 
		 }
     public static void main(String []args){
           
     /* Empty e2=new  Empty();*/
	  
		 Empty e1=new Empty();

	  
         e1.m3();
		/*   System.out.println(e1.x+"......"+e1.y);
         e2.m1();
	  System.out.println(e1.x+"......"+e1.y);
	  System.out.println(e2.x+"......"+e2.y);*/
	 }
}