class MyThread1 extends Thread{
	@Override
	public void run(){
			for (int i=20;i>=1;i--){
		System.out.println("run:"+i);
		}
	}
}
class Test03{
	public static void main(String[] args){
		MyThread1 t = new MyThread1();
		t.start();
		for(int i=0;i<=20;i++){
		System.out.println("main:"+i);
		}
		System.out.println("end of main!");
	}
}
