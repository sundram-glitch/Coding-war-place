class  MT_Test01 extends Thread{

	public static void main(String[] args){
		System.out.println("main start!");
        Thread th1 = new MT_Test01();   
	    th1.run();
		th1.start();
		m1();
		System.out.println("main end!");
	}
	public void run(){
		System.out.println("Run start ");
        m2();
		System.out.println("Run start ");

	}

	static void m1(){
		System.out.println("m1() method executed ");
	}

	void m2(){
		System.out.println("m2() method executed");
	}
	
}
