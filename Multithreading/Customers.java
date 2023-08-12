//1. Single class -> multiple instances -> call start() method on each instance
//		Same logic is executed in every thread
//		Ex: execute deposit() operation multiple times concurrently for diff customers
class Account extends Thread{
    private int amt;
	public Account(int amt){
		this.amt = amt;
	}
	@Override
    public void run(){
		System.out.println("run start in "+getName());
		deposit(amt);
		System.out.println("Deposit successfully");
		System.out.println("run end "+getName());
	}
    public int getAmt(){
        return amt;
    }


    public void deposit(int amt){
        this.amt = amt+amt;
    }
}
public class Customers{
	public static void main(String...args){
		Account aman = new Account(500);
		aman.start();
		System.out.println("balance :"+aman.getAmt());
  }
}
