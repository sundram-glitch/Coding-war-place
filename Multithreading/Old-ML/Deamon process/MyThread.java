class MyThread extends Thread{
	public static void main(String[] args){
		MyThread mt=new MyThread();
		mt.setDaemon(true);
		mt.start();
		System.out.println("Hello World!");
	}
}
