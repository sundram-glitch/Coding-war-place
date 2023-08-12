abstract class Bus{
	
	abstract Bus engine();
	void breaks(){
		System.out.printf("break applied bus stopped"); 
	}
	void wheels(){
		System.out.println("bus woll run on 6 wheels");
	}
	{
		System.out.println("Bus NSB");
	}
	Bus(){
	System.out.println("Bus()");
	}
	Bus(String name){
      System.out.println("Bus(Stirng name) "+name);
	}
	public static void main(String...args){
 Bus b=new Redbus();
  Bus b1=new Volvo();
 b.engine();
 b1.engine();
 Bus b2 = new Redbus("Sundram");
 System.out.println("b1.engine"+b1.engine());
 System.out.println("b1.engine"+b.engine());
	}
}		
	class Redbus extends Bus{
Bus engine(){
		System.out.println("Redbus engine capacity 40kmph");
   return new Redbus();
  }
Redbus(){
	super();
   System.out.println("Redbus()");
}
 Redbus(String name){
      super(name);
	System.out.println("RedBus(-) "+name);
  }
}
class Volvo extends Bus{
Bus engine(){
	System.out.println("Volvo engine capacity 40kmph");
   return new Volvo();
}
public static  void main(String[]args){
 Bus b=new Redbus();
  Bus b1=new Volvo();
 b.engine();
 b1.engine();
 System.out.println("b1.engine"+b1.engine());
 System.out.println("b1.engine"+b.engine());
	}
	Volvo(){
      super();
	  System.out.println("Volvo()");
	}
	
}
