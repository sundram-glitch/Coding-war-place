//Decimal To Binary Conversion
package in.com.arrays;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
    Scanner scanf=new Scanner(System.in);
    int i,j,div;
    int []arr=new int[32];
    System.out.print("Enter Search Decimal Integers: ");
    div=scanf.nextInt();
    for ( i = 0; div!=0; i++,div=div/2 /*System.out.println(div=div/2)*/) {
	arr[i]=div%2;
    System.out.print(arr[i]+" ");
    }
    System.out.println();
    for ( j = 31; j>=0; j--)
	System.out.print((arr[j])+" ");
	scanf.close();
	}
}
/*20
0
0
1
0
1
*/