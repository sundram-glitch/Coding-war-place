//ArrayAsFinal.java
class Arrays09 {
	public static void main(String[] args){
		final int[] ia=new int[5];
		//modifying array locations value
		ia[1]=5;
		ia[2]=6;
		//modifying array referenced variable
		//ia = new int[6];//CE: cannot assign a value to final variable ia
		//printing array locations values
		for (int i=0;i<ia.length ;i++ ){
			System.out.println("ia["+i+"]->"+ia[i]);
		}
		System.out.println("Hello World!");
	}
}
