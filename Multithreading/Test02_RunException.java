//Identify from which class run method is executed in below caese
class MyRunnable implements Runnable{
	public void run(){
       System.out.println("from MyRunnable run()!");
	}
}
class MyThread extends Thread{
	MyThread(){
		super();
	}
	MyThread(Runnable target){
		super(target);
	}
	public void run(){
	System.out.println("From MyThread.run()");
	}
}
class Test02_RunException{
	public static void main(String[] args){
	//Case 1:
	Thread th1 = new Thread();
	th1.start();
	//Case 2:
	MyThread mt = new MyThread();
	mt.start();
	//Case 3:
	MyRunnable mr = new MyRunnable();
	//mr.start();
	///Case 4:
	Thread th2 = new Thread(mr);
	th2.start();
	//Case 5;
	MyThread mt1 = new MyThread();
	Thread th3 = new Thread(mt);
	th3.start();
	//Case 6:
	Thread th4 = new MyThread();
	th4.start();
	//Case 7:
	Thread th5 = new Thread();
	th5.start();
	//Case 8:
	//Runnable r = new Runnable();
	//	r.start();
	//Case 9:
	Thread th6 = new Thread();
	th6.start();
	//Case 10:
	Runnable  r = new MyThread();
	//r.start();
	//Case 11:
	Thread th7 = new Thread(r);
	th7.start();
	//Case 12:
	MyRunnable mr2 = new  MyRunnable();
	MyThread mt2 = new MyThread(mr2);
	mt2.start();
	}
}
