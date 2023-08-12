public class MyThread extends Thread{

	public static void main(String[] args){
		MyThread mt=new MyThread();
		mt.start();
		mt.setDaemon(true);
	}
}
