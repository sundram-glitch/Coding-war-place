import java.util.*;
class Problem12 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <=n ; i++)
		if(n%i==0)count++;
		if(count==2)
		System.out.println(n+" no is prime");
		else System.out.println(n+" is not a prime");
	}
}
