//Important points
//Java 9 onwards we use private in Interface on static and non-static Member
@FunctionalInterface
interface Example{
      public void NSM();	  
	  public default void default_M(){
	  System.out.println("default_M from Example");
	  }
	  public static void SM(){
		  System.out.println("SM from Exmaple");
	  }
	  private static void private_SM(){
	  System.out.println("private_SM from Example");
	  }
	  private void private_NSM(){
      System.out.println("private_SM from Example");
	  }
}
class Sample implements Example {
	public void NSM(){
    System.out.println("NSM From sample");
	}
	public static void main(String[] args){
		Example.SM();
		Example e01=new Sample();
		e01.NSM();
	    Example i5=String::new;
		i5.NSM();
		System.out.println(i5);
		Example e02 =()->{System.out.println("NSM from Lambda");};
	    e02.NSM();
		System.out.println("end of main");
	}
}
