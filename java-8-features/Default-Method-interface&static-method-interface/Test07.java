@FunctionalInterface
interface I1{
	double m1(int x);
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
}
@FunctionalInterface
interface I3{
	String m3(String star);
	private String m5(){
    return ""+this.hashCode();
	}
}
class  Test07{
	Test07(int x){
    System.out.println("x:"+x+" x:"+x+" param exe");
	}

	Test07(String x,char y){
    System.out.println("x:"+x+" x:"+x+" param exe");
	}

	Test07(I1 x,I2 y){
    System.out.println("x:"+x+" x:"+x+" param exe");
	}
	public static void main(String[] args){
		System.out.println("main");
		I1 i1= Test07::new;
		System.out.println(i1.m1(5));

		/*I2 i2=Test07::new;
	    i2.m2("hello world");
		
		I3 i3=String::new;
	    
		String s=i3.m3("o chacha");
		System.out.println("s:"+s);
		System.out.println(i3.m3("o chacha"));*/
	    
		 
	}
}
