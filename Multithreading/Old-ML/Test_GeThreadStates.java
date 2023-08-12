class  MyThread extends Thread{

	public void run(){
		System.out.println("run start!");
		System.out.println("from run method mt state after start call:"+this.getState());
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){
          ie.toString();
		}
		System.out.println("run end");
	}
}
class Test_GeThreadStates{
public static void main(String[]args)throws InterruptedException{
	MyThread mt=new MyThread();
	System.out.println("From main method mt state after obj creation:"+mt.getState());
	mt.start();
	System.out.println("From main method mt state after obj start call:"+mt.getState());
    Thread.sleep(2000);
	System.out.println("From main method mt state after sleep()method call:"+mt.getState());
	Thread.sleep(7000);
	System.out.println("From main method mt state after RUN completed:"+mt.getState());
  } 
}
