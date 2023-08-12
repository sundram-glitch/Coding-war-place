
@FunctionalInterface
interface I1{
	void  m1();
}

@FunctionalInterface
interface I2{
	void m1(int a);
}

@FunctionalInterface
interface I3{
	void m1(String s);
}
class Test04{
	public static void main(String[] args){
    I1 i1=()->{System.out.println();};
    I2 i2=(a)->{System.out.println(a);};
    
	I1 i1=System.out::println;
	I2 i2=System.out::println;

	i1.m1();
	i2.m1(5);

    I1 i3=System.out::println;
	I3 i4=System.out::print;
    i3.m1();
	i4.m1("Sundram");
	System.out.println("\nend main!");
	}
}
