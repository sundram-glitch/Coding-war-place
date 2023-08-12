class Example04{
	static void add(int[] a){
		if(a.length==0){
          System.out.println("Values are not  passed");
		}
		else {
			int sum=0;
		for (int i=0;i<a.length ;i++ ){
			sum=sum+a[i];
		}
		System.out.println("Result:"+sum);
       }
	}
}
public class Test04{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Example04.add(new int[0]);
		Example04.add(new int[]{5});
		Example04.add(new int[]{5,6});
		Example04.add(new int[]{5,6,7});
		Example04.add(new int[]{5,6,7,8});
	}
}
