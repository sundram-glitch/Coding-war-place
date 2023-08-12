// 2. Multiple classes -> multiple instances -> call start() method on each instance
//		We can executed different logic in each thread
//		Ex: execute deposit() and withdraw() operations concurrently for diff customers

class AccountHolder01 extends Thread{
    private int amt;
	@Override
	public void run(){
		withdraw(amt);
	}
	public AccountHolder01(int amt){
    this.amt = amt;
	}
   
	public int getBalance(){
		return amt;
	}
    public void withdraw(int amt){
        this.amt = amt-amt;
		System.out.println("availbale  balance :"+getBalance());
    }
}
class AccountHolder02 extends Thread{
 private int balance;
 
 @Override
 public void run(){
 deposit(balance);
 }
public AccountHolder02(int amt){
    this.balance = amt;
	}
 public void deposit(int amt){
    balance = balance + amt;
	System.out.println("Amt Deposit successfully");
    System.out.println("Total balance :"+getBalance());
	}

public int getBalance(){
		return balance;	
}
}
public class Bank{
	public static void main(String[] args) {
		System.out.println("in main start!");
        AccountHolder01 acc1 = new AccountHolder01(20000);
		AccountHolder02 acc2 = new AccountHolder02(10000);
		acc2.start();
		
 	}
}
