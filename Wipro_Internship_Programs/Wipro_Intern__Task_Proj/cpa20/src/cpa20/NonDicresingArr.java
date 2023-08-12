package cpa20;

import java.util.*;
public class NonDicresingArr {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	ArrayList<Integer> list = new ArrayList<>();
	for (int i = 0; i < n; i++) 
            list.add(sc.nextInt()); 
	System.out.println(optimalSumOperation(list));
  }

static int optimalSumOperation(ArrayList<Integer> list) {
    	for (int j = 0; j < list.size()-2; j++) {
			if(list.get(j)>list.get(j+1)) {
				list.add(j+1, list.get(j+1)+list.get(j+2));
				list.remove(j+2);
				list.remove(j+2);
			}
		}
	return list.size()-1;
}
}
