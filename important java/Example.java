class Example{
	int x;
	int y;
	int z;
static void m1(Object obj){
	if (obj instanceof A ){
		System.out.println("A obj");
		System.out.println((A)obj) x);
	}
	else if (obj instanceof B){
		System.out.println("B obj");
       B b1=(B)obj;
	   System.out.println(b1.x);
	   System.out.println(b1.y);
	}
	else if (obj instanceof C){
		System.out.println("C obj");
		C c1=(C)obj;
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
    }	
	else{
     System.out.println("not match"+obj);
	}
	
}
