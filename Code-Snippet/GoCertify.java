//vvimp program to to understand array size and length
class  GoCertify{
	public static void main(String[] args){
		System.out.println("in side of main!");
		int []a={1,2,3,4,5,6};
        System.out.println(a instanceof Object);
		int i=a.length-1;
		while(i>=0){
		System.out.println(a[i]);
		i--;
		}
	}
}
