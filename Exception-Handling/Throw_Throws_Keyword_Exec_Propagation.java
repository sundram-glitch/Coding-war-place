import java.util.Scanner;
class Throw_Throws_Keyword_Exec_Propagation{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a FNO:");
		int fno=scn.nextInt();
	    System.out.print("Enter a LNO:");
		int lno=scn.nextInt();
			try{
			Addition.add(fno,lno);
	        }
	        catch(IllegalArgumentException e){
		    System.out.println(e.getMessage());
	        }
			System.out.println("end of main");
	}
}
class Addition{
	static void add(int a,int b)throws IllegalArgumentException{
		if((a<0)||(b<0))
			throw new IllegalArgumentException("Do not pass -Ve number as value");
		int c = a+b;
		System.out.println("Result:"+c);
	}
}
