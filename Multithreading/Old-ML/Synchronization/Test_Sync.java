class  PrintMessage{
	//void printMsg
	synchronized void printMsg(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){e.printStackTrace();}
		System.out.println("]");
	}
}
class MessagePrinterThread implements Runnable{
     String msg;
	 PrintMessage pm;
	 Thread th;
public MessagePrinterThread(PrintMessage pm,String msg){
		this.pm=pm;
		this.msg=msg;
		th=new Thread(this);
		th.start();
	}
	public void run(){
		pm.printMsg(msg);
	}
}
public class Test_Sync{
	public static void main(String[] args){
PrintMessage pm=new PrintMessage();
MessagePrinterThread obj1=new MessagePrinterThread(pm,"HI");
MessagePrinterThread obj2=new MessagePrinterThread(pm,"HELLO");
MessagePrinterThread OBJ3=new MessagePrinterThread(pm,"HRU?");
		System.out.println("MAIN END!");
	}
}
