class   tss{
	public static void main(String[] args){
		int p=7,q=4;
		p+=1;
		for (int r = 2;r<6 ;r++ ){
			p+=1;
		if((r+q)>(q-r))
			q=(q+q)+q;
        else{ p = (q^p)&r;
		q=1+r;
		}
		}
		System.out.println(p+q);
	}
}
