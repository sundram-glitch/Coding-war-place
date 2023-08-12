class Example23{
	public static void main(String[] args){
		System.out.println("m!():"+m1(5));
	}
	static int m1(int i){
    while (i==5){
		try{
			try{
				i=10;
				//return 0;
			}
			finally{
				i=20;
				//return i;
				//continue;
			}
			i=30;
			return i;
		}
		finally{
			if(i==30){
				//return 89;	
				continue;
			}
		}
    }
	return 40;
	}
}
