 interface InterfaceA { 
    default void defaultMethod(){ 
        System.out.println("Interface Example default method"); 
    }
	public void main();

	
	default void testExe(){
		System.out.println("textExe");
	}
}
interface InterfaceB {
	public void main();
   default void defaultMethod(){
        System.out.println("Interface B default method");
    }

}
class apple{
	public void main(){
    System.out.println("main-apple");
	}
}
class Impl extends apple implements InterfaceA,InterfaceB{
	//error: class Impl inherits unrelated defaults for defaultMethod() from types Example and InterfaceB
	//if not provide any default meathod implemetation 
	public void defaultMethod(){
	//use to atleast write like this to compilation and further calling decision making purpose

	// existing code here..
       // InterfaceB.super.defaultMethod(); to decide wheather code have to call
	 //Example.super.defaultMethod();
	//InterfaceB.super.defaultMethod();
	}
}
/*public  class Example{

	public static void main(String...args){
  //Impl il=new Impl();
 // il.defaultMethod();
 InterfaceA e=new Impl();
 e.defaultMethod();
  }
}*/
public class Example{
public static void main(String...args){
  /*Impl il=new Impl();
  il.defaultMethod();*/
 InterfaceA e=new Impl();
 e.defaultMethod();
 e.testExe();

  }
}