class Sample420 extends Example420{
     
	 Sample420(){
		 System.out.println("Sample zero-param");
	 }
     Sample420(int a){
		 System.out.println("Sample int-param");
	 }

	public static void main(String[] args) 
	{
         Sample420 s1=new Sample420();
         Sample420 s2=new Sample420(10);
		System.out.println("------------------------");
	}
}
