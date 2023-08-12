class Example15{
	public static void main(String[] args){
		System.out.println("m!()"+m1(1));
	}
	static  int m1(int i){
		while(i==5){
			try{
				return 10;
			}
			finally{
				System.out.println("break");
				break;
			}
		}
		return 20;
	}
}

