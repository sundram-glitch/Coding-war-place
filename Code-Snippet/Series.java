import java.util.Scanner;
class Series{
	public static void main(String[] args){
		System.out.println("");
   Scanner scanOf=new Scanner(System.in);
   		System.out.println("Enter n no");
		System.out.print("\t series:\t");
	int add=0;
	int i;
    int n=scanOf.nextInt();
		for ( i=1;i<n ;++i ){
			add=add+i;
			if(i>=2){
        System.out.print("+");
			}
			System.out.print(i);
		}
		System.out.println("="+(add+i));
	}
}
