//public final native Class<T> getClass()

public class  Test01{
	
	public static void main(String[] args) {
		Example e1 = new Example(10, 20);            //1. loads class bytecode into JVM
									                //2. stores class Example byte code in Class clss object

		Class cls = e1.getClass();			   //3. it returns Example's class Class object reference
	    System.out.println(e1.getClass());
        System.out.println(cls.getName());

		A a1 = new A();
		cls = a1.getClass();					//3. it returns Example's class Class object reference
        System.out.println(a1.getClass());		
		System.out.println(cls.getName());

		String  s1 = new String();
		cls = s1.getClass();				//3. it returns Example's class Class object reference
		System.out.println(s1.getClass());
		System.out.println(cls.getName());
		
		B.m1(e1);
		B.m1(a1);
		B.m1(s1);
	}
}

class A{};


class B{
	static void m1(Object obj){
		System.out.println(obj.getClass().getName());
	}
};