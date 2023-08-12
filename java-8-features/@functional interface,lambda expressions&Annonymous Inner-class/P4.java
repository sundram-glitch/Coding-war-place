class P4 {
	public static void main(String[] args) {
		int a =7, b = 2, c = 4;
		for (int i = 3;i<7 ; i++){
			if((b-c)<(c+b))break;
			a = (c+10)+b;
			b = (a+4)&a;
		}
		System.out.println(a+b);
	}
}
