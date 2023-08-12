class MyThread2 extends Thread{
	public void run(){
    for(int i=20;i>=1;--i){
		System.out.println("i:"+i);
    }
  }
}
class Test04{
	public static void main(String[] args){
      MyThread2 mt1 = new MyThread2();
	  mt1.start();
	  MyThread2 mt2 = new MyThread2();
	  mt2.start();
	  MyThread2 mt3 = new MyThread2();
	  mt3.start();
	  for(int i=0;i<=20;i++){
	  System.out.println("main !"+i);
      }
	}
}
