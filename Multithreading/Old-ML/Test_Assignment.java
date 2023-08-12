class  MyThread extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.println("run:"+i);
	}
  }
}
class Test_Assignment{
	public static void main(String[] args){
		Thread mt=new Thread();
		mt.start();
		for(int i=1;i<=20;i++){
		System.out.println("Hello World!"+i);
	}
	//mt.start();
  }
}