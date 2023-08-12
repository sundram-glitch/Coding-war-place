@FunctionalInterface
interface I5{
   String m5();
}

@FunctionalInterface
interface I6{
	void m6(String s);
}

@FunctionalInterface
interface I7{
	String m7(String s);
}

class Test02{
	public static void main(String[] args){
		I5 i5=String::new;
        i5.m5();

		I6 i6=String::new; 
		i6.m6("Do not ask question immediatly");
        
		I7 i7=String::new; //(s)->{return new String(s);};
		i7.m7("Your doubt will be cleared automatically");
		String s=i7.m7("Your doubts will be cleared automatically");
		System.out.println(s);
		System.out.println(i7.m7("Your doubts will be cleared automatically"));
		System.out.println();
		//I5 i10= s::toUppercase;//CE: FI is method is not a parameterized method,so we can not use s to call tUC method
		//i10.m5();
		//I7 i11=s::toUpperCase;  //CE: FI  method is a parameterized method,tUC is not a parameterized method
		//i11.m7("sundram");
		System.out.println("end of main!");

	}
}
