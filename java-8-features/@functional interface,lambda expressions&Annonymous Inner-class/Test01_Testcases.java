@FunctionalInterface
interface I1{
   void m1();
}

@FunctionalInterface
interface I2{
	int m2();
}

@FunctionalInterface
interface I3{
	void m3(int x);
} 

@FunctionalInterface
interface I4{
	int m4();
}
@FunctionalInterface
interface I5{
	String m5(float f);
}
class Test01_Testcases {
	public static void main(String[] args){
		I1 i1=()->{};
		I1 i2=()->{System.out.println("Hi chitti");};
		I1 i3=()->System.out.println("Hello");
		i1.m1();
		i2.m1();
		i3.m1();
		System.out.println();
		I3 i3i=(x)->{System.out.println(x*x);};
		i3i.m3(5);
	    System.out.println();
		I4 i4=()-> 5;
		I4 i41=()->{return 5;};
        I4 i42=()->'a';
		I4 i43=()->{return 'a';};
       	I4 i44=()->{return 5+4;};
		I4 i45=()->5+6;
		I4 i46=()->"a".hashCode();//haschCode retrun integer values  and a=97
        System.out.println(i41.m4());
	    System.out.println();
        I5 i51=(float f)->{return "a";};
		I5 i52=f->"a";
        I5 i53=(float f)->{
			if (f<0)
				return "a";
			else
				return "b";
			};
		I5 i54=(float f)->{return f<0 ? "c":"d";};
		I5 i55=f->f<0 ? "e" : "f";
		I5 i56=f->f+"a";
			    System.out.println();
	    System.out.println(i51.m5(5.6F));
	    System.out.println(i52.m5(5.6F));
	    System.out.println(i53.m5(-5.65F));
	    System.out.println(i53.m5(5.6F));
	    System.out.println(i54.m5(-5.6F));
	    System.out.println(i54.m5(5.6F));
	    System.out.println(i55.m5(-5.6F));
	    System.out.println(i55.m5(5.6F));
	    System.out.println(i56.m5(-5.6F));
	    System.out.println(i56.m5(5.6F));
	    System.out.println();
		System.out.println("Hello \n end of main!");
	}
}
