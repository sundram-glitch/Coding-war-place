class MyThread extends Thread{
	public  void run(){
		System.out.println("run() start!");
		System.out.println("From run method mt state after start call:"+this.isAlive());
		try{
			Thread.sleep(5000);}
		catch(InterruptedException ie){
           System.out.println("inside try block");
		}
		System.out.println("Run() end");}
}
class Test_isAliveDemo{
	public static void main(String[]args)throws InterruptedException{
		MyThread mt=new MyThread();
		System.out.println("From main method mt state after obj creation:"+mt.isAlive());
		System.out.println("From main method mt state after obj creation:"+mt.isAlive());
		mt.start();
		System.out.println("From main method mt state after start call;"+mt.isAlive());
		Thread.sleep(5000);
		System.out.println("From main method mt state after sleep() call;"+mt.isAlive());
		Thread.sleep(6000);
		System.out.println("From main method mt state run completed:"+mt.isAlive());
	}
}