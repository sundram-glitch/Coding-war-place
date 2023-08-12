interface BankAccount {
	

    public void setAccNum(long accNum);
	public void setAccHName(String accHName);
	public void setBalance(double balance);
	public void setUsername(String username);
    public void setPassword(String password);

	public long getAccNum();
	public String getAccHName();
	public double getBalance();
	public String getUsername();
     
	public void deposit(double amt);
	public void withdraw(double amt);
	public void currentBalance();
	public void transferAmount(BankAccount destAccount,double amt);

	
}
