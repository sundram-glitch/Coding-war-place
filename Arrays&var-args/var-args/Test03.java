class Example03{
	static void add(int... a){
    System.out.println(a.length+" values array is passed");
	for (int i=0;i<a.length ;i++ ){
    System.out.println("Values "+(i+1)+" is: "+a[i]);
	}
	System.out.println("------------------------%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%---------------------------");
	}
}
class Test03{

public static void main(String[] args){
		System.out.println("Hello World!");
		//Example02.add();
        Example03.add(new int[0]);
		Example03.add(5);
		Example03.add(5,6);
		Example03.add(5,6,7);
		Example03.add(new int[]{5,6,7,8});
	}
}