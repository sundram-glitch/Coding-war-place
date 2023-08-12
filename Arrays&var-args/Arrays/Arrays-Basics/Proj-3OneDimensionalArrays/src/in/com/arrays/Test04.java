package in.com.arrays;

public class Test04 {

	public static void main(String[] args) {
    int t[]= {9,10,11,12,13,14,15},i;
    for (i = 1; i <=t.length; i++) {
		for (int j = 0; j < t.length; j++) {
	    System.out.print("\t"+t[j]+"*"+i+"="+t[j]*i);
		}
		System.out.println();
	}//To print the table one-by-one reverse the table
	}

}
