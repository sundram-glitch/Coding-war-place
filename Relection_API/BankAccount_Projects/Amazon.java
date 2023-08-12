public class  Amazon{
	private static SBIBankAccount destAcc;
	static{
		destAcc=new SBIBankAccount();

		destAcc.setAccNum(731847);
		destAcc.setAccHName("Jyoti");
        destAcc.setBalance(200000);
	    destAcc.setUsername("sundramdubey601@gmail.com");
		destAcc.setPassword("jyoti@1234");
	}

	public static void accBalance(){
		destAcc.currentBalance();
	}
	public static void pay(BankAccount srcAcc,double amt){
		srcAcc.transferAmount(destAcc,amt);
	}
	public static void main(String[]args){
	}
}
