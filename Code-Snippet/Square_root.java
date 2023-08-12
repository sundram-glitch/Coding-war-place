import java.util.Scanner;
class Square_root {
	public static void main(String[] args){
		System.out.println("Enter a n");
		Scanner scanOf=new Scanner(System.in);
		int n=scanOf.nextInt();
		int s=0;
		char power='\u221d';
		for (int i=0;i<n ;i++ ){
		System.out.println(i+""+
			power+"");
			s=s*i+n;
		}
		System.out.println("\b="+s);
	}
}
