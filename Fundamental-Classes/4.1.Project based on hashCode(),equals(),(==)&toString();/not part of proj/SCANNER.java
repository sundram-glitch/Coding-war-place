import java.util.Scanner;
class  SCANNER{
	static 
		int x; static String y;
	SCANNER(int x){
     this.x=x;
	}
	SCANNER(String y){
     this.y=y;
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter sno:");
		int sno=scn.nextInt();
		System.out.println("enter sname:");
		String sname=scn.next();
		System.out.println("enter course:");
		String course=scn.next();
		System.out.println("enter fee:");
        double fee=scn.nextDouble();
		System.out.println("Hello World!");
	    System.out.println("Enter values for int cons");
		int i=scn.nextInt();
		SCANNER SNC1=new SCANNER(i);
		System.out.println("Enter values for String cons");
		String j=scn.next();
		SCANNER SNC2=new SCANNER(j);
	    System.out.println("values x:"+x+"values i"+j);
System.out.println("Enter values for int cons");
		int k=scn.nextInt();
		SCANNER SNC3=new SCANNER(k);
	}

}
