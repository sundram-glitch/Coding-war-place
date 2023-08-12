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
class Test_Synchronization{
	public static void main(String[] args){
		//came #2: SHARING DIFFERENT OBJECT
		PrintNumbers pn1=new PrintNumbers();
		PrintNumbers pn2=new PrintNumbers();
		MyThread mt1=new MyThread(pn1);
		MyThread mt2=new MyThread(pn2);
		mt1.start();
		mt2.start();
		System.out.println("MAIN END!");
	}
}
