class Example02{
	static void add(int []a){
		if(a.length==0){
          System.out.println("Values are not  passed");
		}else{
    System.out.println(a.length+" values array is passed");
	for (int i=0;i<a.length ;i++ ){
    System.out.println("Values "+(i+1)+" is: "+a[i]);
	   }
	}
	System.out.println("------------------------%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%---------------------------");
	}
}
class Test02{

public static void main(String[] args){
		System.out.println("Hello World!");
		//Example02.add();
        Example02.add(new int[0]);
		Example02.add(new int[]{5});
		Example02.add(new int[]{5,6});
		Example02.add(new int[]{5,6,7});
		Example02.add(new int[]{5,6,7,8});
	}
}