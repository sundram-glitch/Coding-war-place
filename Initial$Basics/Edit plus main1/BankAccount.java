class BankAccount
{
	 static String bankName;
	 static String branchName;
	 static String ifsc;

	 long accNum;
	 String accHName;
     double balance;

	 void deposit(double amt){
		 balance =balance+amt;
	 }
	  double withdraw(double amt){
		 balance=balance-amt;
		 return amt;

	 }
	 void currentbalance(){
		 System.out.println(balance);

	     /*void ifsc(String ifsc){
		 System.out.println(ifsc);*/
	 }
	 void display(){
		System.out.println("BankName:"+bankName);
	    System.out.println("branchName:"+branchName);
		System.out.println("ifsc:"+ifsc);
		System.out.println("accName:"+accHName);
		System.out.println("accNum:"+accNum);
        System.out.println("balance	:"+balance);
	}
}
