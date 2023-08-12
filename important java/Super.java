class Super 
{
	void Sample(){
		System.out.println("Method of super class");
	}

}
    class Sub extends Super{
	  void Sample(){
		  System.out.println("Methos of sub class");
  }
}
 class TestSuccessful
 {
     public static void main(String[] args) 
	{

		System.out.println("Hello World!");
		Super gud=new Super();
		gud.Sample();
		Super obj=(Super) new Sub();
		obj.Sample();
		Super obj1=new Sub();
		Sub sub=(Sub) obj1;
		sub.Sample();
	}
}