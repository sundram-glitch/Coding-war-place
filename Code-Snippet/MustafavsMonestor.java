import java.util.*;
public class MustafavsMonestor {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N  = sc.nextInt(); int M = sc.nextInt();
	  ArrayList<Integer> arr = null;
	  ArrayList<ArrayList<Integer>> list1 = 
			  new ArrayList<ArrayList<Integer>>();
	  for (int i = 0; i < M; i++) {
		int count = 0;
		arr = new ArrayList<Integer>();
		  while(count!=N) {
		    arr.add(sc.nextInt());
		    count++;
		  }
		  list1.add(arr);
	  }
	  ArrayList<ArrayList<Integer>> list2 = 
			  new ArrayList<ArrayList<Integer>>();
	  for (int i = 0; i < M; i++) {
		int count = 0;
		arr = new ArrayList<Integer>();
		  while(count!=N) {
		    arr.add(sc.nextInt());
		    count++;
		  }
		  list2.add(arr);
	  }
	  sc.close();
	  ArrayList<ArrayList<Integer>> temporary = new ArrayList<>(list1);	  
	  int strength = Collections.min(list1.get(0));
	  int index = list1.get(0).indexOf((Object)strength);
	  strength += list2.get(0).get(index);
	  for (int i = 1; i < list1.size(); i++) {
		  int min = Collections.min(list1.get(i));
		  int temp = 0;
				  while(strength>=min && !list1.get(i).isEmpty()){
                  temp = min;
                  list1.get(i).remove((Object)min);
	    	      min = Collections.min(list1.get(i));
	              }
		  temp = temporary.get(i).indexOf((Object)min);
	      strength += list2.get(i).get((int)temp);
	  } 
	  System.out.println(strength);
  }
}
