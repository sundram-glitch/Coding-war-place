class Bank {
	public static void main(String[] args){
        BankAccount acc1=new BankAccount();
		acc1.setActive(true);
		System.out.println(acc1.isActive());
		if(acc1.isActive())
			System.out.println("active");
		else
		System.out.println("NO ACTIVE");
		//acc1.setActive(true);
		System.out.println(acc1.isActive()?"active":"!active");
	
		System.out.println("=====================================================");
	}
}
/*false
NO ACTIVE
active*/