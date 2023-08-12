class P3 {
	public static void main(String[] args) {
		int p  =8, q = 4, r =4; 
		for ( r= 2;r< 6 ; r++){
		if((8&q)<(r^8))
			continue;
		q = (r+q)+r;
		q = p+q;
		}
		System.out.println(p+q);
	}
}
