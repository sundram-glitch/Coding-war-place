//working with 'this' & 'super' keyword
//In each and every cons there is implicit default super() call 
//In inHeritence policy its definetily going to apply at default super() call...
 class Example{

private Example(){
 System.out.println("Example zero-parram");
 }

Example(int a){
System.out.println("Example int-param"+a);
 } 
}
public class Sample extends Example{

	Sample(){
		System.out.println("Sample zero-param");
	}

	Sample(int a){
    super(5);
	System.out.println("Sample int-param");
	}
	public static void main(String... args){
    Sample s1=new Sample();
	Sample s2=new Sample(10);
	}
}
