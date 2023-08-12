class P5 {
	public static void main(String[] args){
		int pp = 0 , qq  = 3, rr = 4;
		for (int i = 2; i < 6; i++){
		qq = pp^qq;
		if((pp+5)>(rr-pp)|| qq > rr)
			qq = 7+rr;
		}
		System.out.println(pp+qq);
	}
}
