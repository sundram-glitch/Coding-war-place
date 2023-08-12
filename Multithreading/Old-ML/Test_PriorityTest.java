class  MyThread extends Thread{
	public void run(){
  	System.out.println(/*java.lang.*/Thread.currentThread().getName()+"run executed!"+getPriority());
	}
}
class Test_PriorityTest{
public static void main(String[]args){
	MyThread mt1=new MyThread();
	MyThread mt2=new MyThread();

	mt1.setPriority(7);
	mt2.setPriority(9);

	mt1.start();
	mt2.start();
	System.out.println("main executed");
  }
}