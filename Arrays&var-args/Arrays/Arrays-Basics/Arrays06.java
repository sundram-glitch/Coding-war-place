//v.imp
class ArraysTest02{
  static void m1(int[] ia){
  for (int i=0;i<ia.length;i++ ){
  //ia[i]={1,2,3,4,5};
    ia[i]=i-1;
	System.out.println("ia["+(i)+"]:"+ia[i]);
   }//again modi fication done here 
   System.out.println(".\t \t\t\t");
  }
  static void m1(){

  }
}
class  Arrays06{
	public static void main(String[] args){
		int i=0;
		
		int [                             	] a = {5,6,7,8,9};
		ArraysTest02.m1(a);
		for (;i<a.length;i++)
		{
			System.out.println("a["+i+"]:"+a[i]);//reflect here also
		}
	}
}