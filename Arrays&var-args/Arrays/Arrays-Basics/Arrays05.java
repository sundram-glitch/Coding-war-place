class ArraysTest01{
	static void m1(int []ia){
  		int i=0;
		System.out.println("Array size :"+ia.length);
		System.out.println("its elements");
		for (;i<ia.length;i++)
		{
			System.out.println("ia["+i+"]:"+ia[i]);
		}
	}
}
class  Arrays05{
	public static void main(String[] args){
    int []i1={5,6,67,7,8};
	ArraysTest01.m1(i1);
	System.out.println();
	int [] i2=new int[5];
	ArraysTest01.m1(i2);
	System.out.println();
	ArraysTest01.m1(new int[7]);
	System.out.println();
	//ArraysTest.m1({2342,4234,432});
    ArraysTest01.m1(new int[]{2342,4234,432});
	}
}
