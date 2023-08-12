public class  MyThread01 extends Thread{
	MyThread01(){
		super();
	}
	MyThread01(String name){
		super(name);
	}
	@Override
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println(getName()+"i:"+i);
	}
	}


	public static void main(String[] args){
		Thread mt01=new Thread();
		mt01.start();
		MyThread01 mt02=new MyThread01();
        mt02.start();
		for(int i=1;i<=20;i++){
		System.out.println("Hello World!"+i);

  }
}
}