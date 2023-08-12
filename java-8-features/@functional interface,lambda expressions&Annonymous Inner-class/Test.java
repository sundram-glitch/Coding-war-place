// Java program to demonstrate functional interface 

interface Example01 {// abstract Example01{
    public abstract void start();
	public static void main(String ... args){}
}
class Example02{
  public  void Hi(){
  System.out.println("hi from Ex02");
  }
}
public class Test 
{ 
	public static void main(String args[]) 
	{ 
		// create anonymous inner class object 
		new Thread(new Runnable() 
		{ 
			@Override
			public void run() 
			{ 
				System.out.println("New thread created"); 
			} 
		}).start(); 
		Example01 e1=new Example01(){
        public void start(){
        System.out.println("inside start of aic");
		}
		};
		e1.start();
Example02 e2=new Example02(){
     public void Hi(){
System.out.println("hi from Ex02 aic");
	 } 
};
e2.Hi();
	} 
} 
