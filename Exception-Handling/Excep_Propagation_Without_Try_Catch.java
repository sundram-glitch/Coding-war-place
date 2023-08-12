class Excep_Propagation_Without_Try_Catch{
	public static void main(String[] args){
		System.out.println("MAIN START");
		m1();
		System.out.println("end of main!");
	}
	static void m1(){
		System.out.println("m1 start:");
		m2();
		System.out.println("m1 end");
	}
	static void m2(){
		System.out.println("m2 start");
		System.out.println(10/0);
		System.out.println("m2 end");
    }
}
