class Investi{
     int x = 10;
	 int y = 20;

	 void sundram(){
		x=1977;
        y=276;     
	 }

	 void dubey(){

System.out.println(x);
System.out.println(y);

	}
     void m1(){
		 sundram();//1977
          dubey();//276
	 }
	public static void main(String[]args){
		Investi i1=new Investi();
		i1.m1();
System.out.println(i1.x);//1977
System.out.println(i1.y);//276
	}

}
