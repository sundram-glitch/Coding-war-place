class Example10{
	public static void main(String[] args){
	      int i=0;
		for (i=1;i<=10;i++){
		System.out.println("\nIn loop:"+i);
		try{
		System.out.println("In try");
		  if(i==5){
			  System.out.println("inside if");
			continue; 
		  }
		}
		finally{
			System.out.println("In finally");
		}
		System.out.println("After try/finally!");
		}
		System.out.println("\nAfter loop");
	}
}
