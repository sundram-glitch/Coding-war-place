class MyThread extends	Thread{
public void run(){
	System.out.println("run start");//2(3)
	System.out.println("From run method mt state after start call:"+this.getState());//2(4)
	try{
		Thread.sleep(5000);
	}
catch(InterruptedException ie){
	ie.printStackTrace();
}
System.out.println("run end");//2(7)
  }
}
class Test_Deamon{
public static void main(String[]args)throws InterruptedException{
	MyThread mt=new MyThread();
	System.out.println("From main method mt state after obj creation:"+mt.getState());//new(1)
	mt.start();//2(1)
System.out.println("From main method mt state after start call:"+mt.getState());//ruunnable2(2)
Thread.sleep(500);//2(5)
System.out.println("From main mt state after mt.sleep() call:"+mt.getState());//time_waiting2(6)
Thread.sleep(6000);//stop2(7)
System.out.println("From main method mt state after run completed:"+mt.getState());//2(8)
  }
}