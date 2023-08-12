
class HashCodeDemo{
	int x=10;
	int y=20;
}

class Example{

	public static void main(String[] args){
		Example e1=new Example();
		Example e2=new Example();
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
        System.out.println();
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(e1.getClass().getName());
		System.out.println("end of main!");
	}
}
