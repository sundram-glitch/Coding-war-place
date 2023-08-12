class Empty
{
	 int x=10;
	 int y=20;

	 void m1(){

		 Empty e1=new Empty();
		 e1.x=50;
		 e1.y=60;
}
     public static void main(String []args){
           
      Empty e2=new  Empty();

	  System.out.println(e2.x+"......"+e2.y);
         e2.m1();
	  System.out.println(e2.x+"......"+e2.y);
	 }
}