class  P1{
	public static void main(String[] args) 
	{
	 int  a  = 8, b = 24, v = 10 , c =0;
	 while(v>5){
     a = a+v+2;
	 c=(a+b)-10;
	 while(c>14){
     b +=c+2;
	 c -=4;
	 }
	 v /=4;
	 }
		System.out.println(b+" "+c );
	}
}