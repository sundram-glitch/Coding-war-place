class  MyRunnable implements Runnable{

	public void run(){
    System.out.println("From MyRunnable run() ");
	}
}
class MyThread extends Thread{

	MyThread(){
		super();
	}
	MyThread(Runnable target){
		super(target)   ;
	}
	@Override
	public void run(){
	System.out.println("From MyThread run()");
	super.run();
	}
}

class Test01_RunException{

	public static void main(String[] args){
		System.out.println("main start!");
		/*Thread th1 = new Thread();
        th1.start();
		MyThread mt = new MyThread();
		mt.start();
		MyRunnable mr = new MyRunnable();//:-cfs(start())
		mr.start();
		MyRunnable mr = new MyRunnable();
		Thread th2 = new Thread(mr);
		th2.start();
		MyThread mt1 = new MyThread();
		Thread th3 = new Thread(mt1);
		th3.start();
		Thread th4 = new MyThread();
		th4.start();
		Thread th5 = new MyRunnable();
		th5.start();
        Runnable r = new MyRunnable();
		r.start();
		MyRunnable  = new Thread();
		th5.start();
		MyRunnable mr2 = new MyRunnable();
		MyThread mt2 = new MyThread(mr2);
	    mt2.start(); 
		MyThread mt3 = new MyThread();
		MyThread mt4 = new MyThread(mt3);
		mt4.start();
		MyThread mt5 = new MyThread(mt5);
		mt5.start();*/
		mt6 = new MyThread(mt6);
		mt6.start();
		System.out.println("main end!");
	}
	static MyThread mt6;
}
