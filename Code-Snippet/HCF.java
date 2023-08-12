class  HCF{
	public static void main(String[] args) {
		int a = 136, b = 166, max = 0;
		for (int i = 1; i<136 ; i++){
			if(a%i==0 && b%i==0 && i>max) max = i;
		}
		System.out.println(max);
	}
}
