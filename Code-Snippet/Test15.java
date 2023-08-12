class  Test15{
	public static void main(String[] args){
		System.out.println("\t main!");
		int x = 10; 
		int y = new Test15().change(x);
		System.out.println(x+y);
	}
	int change(int x){
     x=12;
	 System.out.println("x\t:"+x);
	 return x;
	}
}
