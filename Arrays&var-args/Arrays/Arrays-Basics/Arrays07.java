class ArraysTest03 {
	int x=10;
	int y=20;
	void m1(){
    x=5;
	}
}
class ArraysTest0301{
	static void m2(ArraysTest03[] e){
	e[2].m1();	
	}
}

public class Arrays07{
	public static void main(String... args){
    ArraysTest03[] a1={new ArraysTest03(),new ArraysTest03(),new ArraysTest03(),new ArraysTest03()};
	ArraysTest0301.m2(a1);
   	for (int i=0;i<a1.length ;i++ ){
    System.out.println("a1["+i+"].x:"+a1[i].x);
	System.out.println("a1["+i+"].y:"+a1[i].y);
 	}
  }
}