class DaemonDemo extends Thread implements Runnable{
	Thread th;
	DaemonDemo(){
		th=new Thread(this);
		th.setDaemon(true);
		th.start();
	//th.setDaemon(true);
	}
	public void run(){
		System.out.println("Run:"+th.isDaemon());
		for(int i=1;i<=100;i++){
			System.out.println("RUN:"+i);
		}
	}
}
class Test_DaemonDemo{
public static void main(String [] args){
	DaemonDemo dd1=new DaemonDemo();
	System.out.println("Baba countdown start");
	Thread th=new DaemonDemo();
	th.setDaemon(true);//Non-Daemon is having forground priority
	th.start();
	for(int i=1;i<=5;i++){
		System.out.println("MAIN:"+i);

	}
		
  }
}
/*MAIN:1
MAIN:2
MAIN:3
RUN:1
MAIN:4
RUN:2
MAIN:5
RUN:3*/
