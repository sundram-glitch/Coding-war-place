class Example03{
	static void m1(){
		System.out.println("Exxample m1");
	}
}
class Sample03 extends Example03{
static void m1(){

}
	public static void main(String[] args){
		Example03 e=new Sample03();
		e.m1();
		System.out.println("Hello World!");
	}
}
