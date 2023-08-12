class Bank 
{
	public static void main(String[] args) 
	{
		BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount();
		System.out.println("-----original values-----");
		System.out.println("acc1 details");
		/*acc1.display();*/
		System.out.println("acc2 details");
		/*acc2.display();*/
		//initializings static fields
		BankAccount.bankName="HDFC";
        BankAccount.branchName="Ameerpet";
		BankAccount.ifsc="HD123AM";

		System.out.println("static fields are initialized");
		//intialinzing acc1 object non-static fields
		acc1.accNum=78798;
		acc1.accHName="HK";
		acc1.balance=99999;
		System.out.println("acc1 non-static fields are initialize");

        //intialinzing acc2 object non-static fields
		acc2.accNum=9878;
		acc2.accHName="BK";
        acc2.balance=982734;
        System.out.println("acc2 non-static fields are initialize");
        System.out.println("-----value of initialization------");
		System.out.println("\nacc1 details");
		acc1.display();
		System.out.println("\nacc2 details");
		acc2.display();
	}
}
