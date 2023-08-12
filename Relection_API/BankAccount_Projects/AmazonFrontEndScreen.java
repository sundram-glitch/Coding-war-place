import java.util.Scanner;
class  AmazonFrontEndScreen{
	public static void main(String[]args)throws ClassNotFoundException,InstantiationException,IllegalAccessException{
		//1 login to amazon account 
		//2 display products
		//3select product
		//4count total amount to pay
		//5prompt diff Bank Names supporting for payment 
		//6Read bank name from customer
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter bank name:");
		String bank=scn.nextLine();
		Object obj=Class.forName(bank).newInstance();
		
		if(obj instanceof BankAccount){
		BankAccount srcAcc=(BankAccount)obj;

		srcAcc.setAccNum(7318);
        srcAcc.setAccHName("Sundram");
		srcAcc.setUsername("sundramdubey601@gmail.com");
		srcAcc.setBalance(1000000);
		srcAcc.setPassword("java");

		System.out.println("Enter Amount:");
		double amt=scn.nextDouble();
		scn.nextLine();

		System.out.println("/n Payment is goin on...");
		Amazon.pay(srcAcc,amt);
		System.out.println("Payment done");
		System.out.println("/n  Product will delivered to /n your home address in 4 working days");

		System.out.println("");
		System.out.println(bank+"balance:");
		srcAcc.currentBalance();

		System.out.println("Amount acc balance:");
		Amazon.accBalance();
		}
		else{
		System.out.println(bank+"is not a BankAccount!");
	}
  } 
}