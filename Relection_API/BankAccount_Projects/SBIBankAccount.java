class  SBIBankAccount implements BankAccount{
	private   long      accNum;
    private String    accHName;
	private double  balance;
	private String username;
	private String password;
	public void setAccNum(long accNum){
		this.accNum=accNum;
	}
	public long getAccNum(){
		return this.accNum;
	}
	   
	public void setAccHName(String accHName){
		this.accHName=accHName;
	}
		public String getAccHName(){
			return this.accHName;
		}

	public void setBalance(double balance){
		this.balance=balance;
	}
  	public double getBalance(){
	return this.balance;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
         return this.username;
	}
    public void setPassword(String password){
		this.password=password;
	}
	@Override
	public void deposit(double amt){
		this.balance=this.balance+amt;
		System.out.println("Cash"+amt+"is credited in"+"HDFC Bank Account");
	}
	@Override
	public void withdraw(double amt){
		this.balance=this.balance-amt;
		System.out.println("Cash"+amt+"is debited from"+"HDFC Bank Account");
	}
	@Override
	public void currentBalance(){
		System.out.println(this.balance);
	}
	@Override
		public void transferAmount(BankAccount destAcc,double amt){
		this.withdraw(amt);
		destAcc.deposit(amt);
	System.out.println("Cash"+amt+"is transfer"+"from HDFC Bank");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
