class Example09{
	public static void main(String[] args){
	      int i=0;
		for (i=1;i<=10;i++){
		System.out.println("\nIn loop:"+i);
		try{
		System.out.println("In try");
		  if(i==5){
			break; 
		  }//if
		}finally{
			System.out.println("In finally");
		}//finally
		System.out.println("After try/finally!");
		}//for
		System.out.println("\nAfter loop");
	}
}
