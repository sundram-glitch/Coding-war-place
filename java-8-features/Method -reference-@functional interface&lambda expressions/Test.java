//for static method we can not call static method creating nsm ref
class A{
    A(){
    System.out.println("Nenu Cheppanu Brother");
	}

static void m1(){
    System.out.println("hi");
}
void m2(){
	System.out.println("Hello");
    }
}

@FunctionalInterface
interface I1{
	void abc();
}

class Test{
	public static void main(String[] args){
		//I1 i1=()->{A.m1();};//Without static-method referce code
		I1 i1= A::m1;//concise and static-method reference code
		i1.abc();
	System.out.println();
//===============================================================
        //I1 i2=()->{new A().m2();};// without non-static method refercens
		I1 i2=new A()::m2;//with non-static method referce call
		i2.abc();
    System.out.println();
//===============================================================
        //I1 i3=()->{new A();};//WIthout method referce constructor code
	    I1 i3=A::new;// with method reference constructor code
		i3.abc();
	System.out.println();
	}
}
