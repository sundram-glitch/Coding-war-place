class Example02{
	private int x;
	Example02(int x){
		this.x=x;
	}
	@Override
	public int hashCode(){
		return x;
	}
	public int JVMHC(){
		return super.hashCode();
	}//bad approach code if you want diff logic of hashCode then use System.identityHashCode(-) static method directly
}
class IdentityHashCodeTest{
	public static void main(String[] args){
    Example02 e1=new Example02(5);
	Example02 e2=new Example02(5);
	Example02 e3=new Example02(6);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(""+e3.hashCode());
		System.out.println();
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));
        int x=System.identityHashCode(e1);
        System.out.println();
		System.out.println(x);
		System.out.println();
		System.out.println(e1.JVMHC());
		System.out.println(e2.JVMHC());
		System.out.println(e3.JVMHC());

		System.out.println("end of main6");
	}
}
