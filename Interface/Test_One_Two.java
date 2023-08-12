interface One{
	void m1();
	default void m2(){
    System.out.println("dm from one ");
	}
}
interface Two{
	void m1();
	/*default void m2(){
    System.out.println("dm from one ");
	}*/
}
class One_Two implements Two,One{
public  void m1(){
System.out.println("m1 from one_two ");
 }
}
public class Test_One_Two{
	public static void main(String[] args){
		System.out.println("Hello World!");
		One one=new One_Two();
		one.m1();
		one.m2();
	}
}
