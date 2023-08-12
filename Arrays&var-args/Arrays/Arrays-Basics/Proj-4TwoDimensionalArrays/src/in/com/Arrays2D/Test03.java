package in.com.Arrays2D;

public class Test03 {

	int [][]arr=new int[2][3];
	public static void main(String[] args) {
    Test03 test03=new Test03();
    for (int k = 0; k < test03.arr.length; k++) {
		for (int l = 0; l < 3; l++) 
			System.out.print(test03.arr[k][l]+" ");
	
		System.out.println();
	}
  }
}
