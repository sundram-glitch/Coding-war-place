class MyThread extends Thread{
	MyThread(){
		super();
	}
	MyThread(String name){
		super(name);
	}
	public void run(){
	for(int i=0;i<10;i++){
		System.out.println(getName()+"i:"+i);
	}
	System.out.println("mt1 Thread's initial name and priority");
		System.out.println("mt1 name:"+this.getName());
		System.out.println("mt1 priority:"+this.getPriority());
		System.out.println();
		System.out.println("mt2 Thread's initial name and priority");
		System.out.println("mt2 priority:"+this.getPriority());
  }
}
class Test_ThreadNameAndPriority{
	public static void main(String[] args){
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread("child2");
        mt1.start(); mt2.start();
		System.out.println("mt1 Thread's initial name and priority");
		System.out.println("mt1 name:"+mt1.getName());
		System.out.println("mt1 priority:"+mt1.getPriority());
		System.out.println();
		System.out.println("mt2 Thread's initial name and priority");
		System.out.println("mt2 priority:"+mt2.getPriority());

		mt1.setName("child1");
		mt1.setPriority(6);
	}
}
