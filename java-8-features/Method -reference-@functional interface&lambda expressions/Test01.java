interface I1{
  int m1(int a);
}

interface I2{
  void m1();
}

interface I3{
  int m1(String s);
}

class A{
static{
	System.out.println("A SB");
}

A(){
    System.out.println("A() Contructor");
}

A(int a){
	System.out.println("A(int)Constructor");
}
 A(String a){
    System.out.println("A(String)Constructor");
 }
public static void m2(){
    System.out.println("From class A static-m2(no-param)");
}

public void m3(int x){
	System.out.println("from class A m3(no-param)"+x);
}

public static int m2(String s){
	System.out.println("From class A m2(String-param and return type int)"+s);
	return 50;
}

public static int m3(String s){
    System.out.println("From class A m3(String param and int return type");
    return 30;
	}
}

class Test01{
	public static void main(String[] args){
    //I1 i1=A::m2;
    //i1.m1();
    /* I1 i2=new A()::m3;
	i2.m1(4);*/
	I1 i3=(a)->{new A (1/*or null*/);new A(); new A("hello chitti");
	return 10;};
	i3.m1(5);
	//I1 i4=A::new;
	//i4.m1(3);
//=======================================================
    //I1 i4=new A()::m3; //<- //I2 i4=(x)->{A.m2(x);};
    //i4.m1(1);
	//I2 i5=A::m2;
    //i5.m1();
//===========================================================
    //I1 i6=new A()::m3;//I2 i6=()->{new A().m3();
    //i6.m1(7);
    //I1 i7=new A(10)::m3;//I2 i6=()->{new A(10).m3();
	//i7.m1(7);	
	I3 i8=A::m2;
	i8.m1("HK");
	int x=i8.m1("NIT");
	System.out.println(x);
	System.out.println(i8.m1("AM"));
	System.out.println("end main!");
//=========================================================================
/*    I3 i8= A::new;
	i8.m1("sundram");*/
	}
}
