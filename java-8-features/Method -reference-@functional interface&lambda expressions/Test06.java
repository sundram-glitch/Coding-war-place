@FunctionalInterface
interface I1{
	String m1();
	private String m5(){
    return ""+this.hashCode();
	}
}
@FunctionalInterface
interface I2{
	void m2(String str);
	private String m5(){
    return ""+this.hashCode();
	}
	private static void m3(){
    System.out.println("inside private m3 of I2");
	m5();
	}
	default void m4(){
    System.out.println("inside default method");
	m3();
	}
}
@FunctionalInterface
interface I3{
	String m3(String star);
	private String m5(){
    return ""+this.hashCode();
	}
}
class  Test06{
	public static void main(String[] args){
		System.out.println("main");
		I1 i1= String::new;
		System.out.println(i1.m1());

		I2 i2=String::new; 
		I2 i21=I2::m3;
		i21.m2("hi");
	    i2.m2("hello world");
		
		I3 i3=String::new;
	    
		String s=i3.m3("o chacha");
		System.out.println("s:"+s);
	    
		 
	}
}
