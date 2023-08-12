2class Example17{

public static void main(String[] args){
		System.out.println("M!(5)"+m1(5));
	}
	static int m1(int i){
		while (i==5){
			try{
		return 10;
			}
			finally{
				continue;//recursive
			}
		}
		return 20;
	}
}
