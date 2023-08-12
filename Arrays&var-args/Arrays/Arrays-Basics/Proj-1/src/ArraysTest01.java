class ArraysTest01{
  int x=10; int y=20;ArraysTest01 t=new ArraysTest01();
  static {
  System.out.println("ArraysTest03 is loaded");
  } ArraysTest01(){
  System.out.println("ArraysTest03 cons is loaded");
  }
  
}
public class  Test01{
	static ArraysTest01[] a1=new ArraysTest01[5];
	ArraysTest01 []a2={new ArraysTest01(),new ArraysTest01(),new ArraysTest01(),new ArraysTest01()};
	static Arrays11 a3=new Arrays11();
	public static void main(String[] args){
		/*System.out.println("Hello World!");
		ArraysTest03 []a4=new ArraysTest03[2];
		System.out.println("a3 array obj is created");
        a1[1]=new ArraysTest03();
		a4[1]=new ArraysTest03();
		System.out.println(a1[1].x);
		//System.out.println(a2[1].x);
		System.out.println(a4[1].x);
		System.out.println();
	ArraysTest03 a5=new ArraysTest03();
	//ystem.out.println(a1[0].x);NPE
	System.out.println(a3.a2[0].x);
	//System.out.println(a4[0].x);NPE
	System.out.println(a3.a1[1].x);*/
	}
}
