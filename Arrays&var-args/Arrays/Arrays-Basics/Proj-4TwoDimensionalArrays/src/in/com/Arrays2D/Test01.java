package in.com.Arrays2D;

public class Test01 {

	public static void main(String[] args) {
	int arr[][]= {{10,20,30},{40,50,60}};
	System.out.println();
    for (int r = 0; r < arr.length; r++) {
		for (int c = 0; c < arr.length; c++) {
			System.out.print(arr[r][c]+" ");
		}
		}
	}

}
