import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
        int input3 = sc.nextInt();
int input4 = sc.nextInt();
int input5 = sc.nextInt();
ArrayList al = new ArrayList();
al.add(input1);
al.add(input2);
al.add(input3);
al.add(input4);
al.add(input5);
int max = (int)Collections.max(al);
		System.out.println(max>100?max:0);
	}
}
