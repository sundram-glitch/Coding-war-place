class Propagation_With_Try01{
	public static void main(String[] args){
		System.out.println("In main method start ");
		m1();
        System.out.println("In main method end");
	}
	static void m1(){
		
        System.out.println("In m1 method start ");
		System.out.println("10/0:"+10/0);
		System.out.println("In m1 method end");
		
	
	}
}
