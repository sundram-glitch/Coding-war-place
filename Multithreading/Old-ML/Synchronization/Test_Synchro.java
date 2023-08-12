class  PrintNumbers{
	synchronized void display(){
		for(int i=1;i<=20;i++){
			System.out.println(Thread.currentThread().getName()+"run:"+i);
		}
	}
}
class MyThread extends Thread{
	PrintNumbers pn;
	MyThread(PrintNumbers pn){
		this.pn=pn;
	}
	public void run(){
		pn.display();
	}
}
class Test_Synchro{
	public static void main(String[] args){
		//came #1: SHARING SAME OBJECT
		PrintNumbers pn=new PrintNumbers();
		MyThread mt1=new MyThread(pn);
		MyThread mt2=new MyThread(pn);
		mt1.start();
		mt2.start();
		System.out.println("MAIN END!");
	}
}
