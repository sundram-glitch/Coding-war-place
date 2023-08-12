interface Vehicle{
     void engine();
	 void breaks();           
}
	abstract class Bus implements Vehicle{
	
	}

//class Tourbus extends Bus{
	
abstract class Redbus extends Bus {
	
/*	public void engine(){
		System.out.println("Redbus engine capacity is 40 kmph");
	}*/
}
abstract class Hiringbus extends Redbus{
	//@Override
	
}
abstract class Buss extends Hiringbus{
	//@Override
	
}
 class Abhibus extends Buss{
public void breaks(){
		System.out.println("Bus has two breaks");
}
}
class Jat extends Buss{
public void engine(){
		System.out.println("Redbus engine capacity is 40 kmph");
	}
}
class Jar extends Buss{
	public void light(){
		System.out.println("Redbus engine capacity is 40 kmph");
	}
}
/*class Hiringbus extends Redbus{
	//@Override
	
}*/

class Service {
public static void main(String[] args){
		/*v=new Redbus();*/
	Vehicle	 s=new Abhibus();
		s.engine();s.breaks();
		/*Vehicle vi=new Hiringbus();
		vi.engine();
		vi.breaks();*/
			/*	Vehicle b=new Volvo();
b.engine();
b.breaks();*/
				//Vehicle b1=new Vehicle();
//Vehicle is abstract can not be instantiate ok!
		System.out.println(";==============================================;");
	}
}