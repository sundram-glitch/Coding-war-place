package binary.tree.operation;

import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int arr[] = new int[N];
    int start = 0;
    int end = N;
    int key = scan.nextInt();
    for (int i = 0; i < arr.length; i++)
    	arr[i] = scan.nextInt();
    System.out.println(BinarySearch1(Arraysort(arr),start, end, key));
  }

   static int  BinarySearch1(int[] arr, int start, int end, int key) {
	int mid = 0;
	while(start<=end) {
		mid = (start+end)/2;
		if(arr[mid] == key) return mid;
		else if(arr[mid]<key) start = mid+1;
		else end = mid -1;
		}
	   return -1;
   }

static int[] Arraysort(int[] arr) {
   int temp = 0;
   for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr.length-i-1; j++) {
	if(arr[j]>arr[j+1]) {
		temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
	}
	}
   }	
   System.out.println(Arrays.toString(arr));
   return arr; 
  }
}
