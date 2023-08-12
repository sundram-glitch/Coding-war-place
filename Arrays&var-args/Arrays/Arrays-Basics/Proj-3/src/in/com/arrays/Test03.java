package in.com.arrays;

import java.util.Scanner;

public class Test03 {
 
  	public static void main(String[] args) {
    Scanner scanOf=new Scanner(System.in);
  	int id;int sub[]=new int[6];int pass=1,i,sub_sum=0;
    String name;
    System.out.println("Enter stuid,name and 6 sub marks");
    id=scanOf.nextInt();
    name=scanOf.next();
    for ( i = 0; i <sub.length; i++) {
		sub[i]=scanOf.nextInt();
		if(sub[i]<35)
			pass=0;
		sub_sum=sub_sum+sub[i];
	}
    System.out.println("\tname-\t"+name+"\n\tid-\t"+id);
    if(pass==0)
    System.out.println("\tResult-\tfailed");
    else
    System.out.println("\tResult-\tpassed");
  	System.out.println("\tavg=\t"+(sub_sum/6));
  	}

}
