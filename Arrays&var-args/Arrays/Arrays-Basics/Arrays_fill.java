import java.util.Arrays;

class Arrays_fill{
	
	static int [] array = new int[5];
	
	public static void main(String[] args){
		for(int i=5; i>0;i--)
			/*0->5*/array[5-i]=i;
		
		System.out.println("array\t"+array[0]);
		Arrays.fill(array,2,4,8);//5,0,1,4,8
		
		for(int i =0; i<5;i++)
			System.out.println(array[i]);
		
		System.out.println("Hello World!");
	}
}
