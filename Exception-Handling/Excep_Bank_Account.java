import java.util.Scanner;
class Excep_Bank_Account{

	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		try{
		System.out.println("Enter amt to deposit:");
		int total_Amt=Acc_Holder.Deposit(scn.nextInt());
		System.out.println("total_Amt!"+total_Amt);
		}
		catch(IllegalArgumentException e){
		System.out.println(e.getMessage());
		}
	}
}
class Acc_Holder{
	static int Deposit(int a)throws IllegalArgumentException{
	if(a==500){
     System.out.println("amount:"+a);
	return a+1000;
	}
	else{
		throw new IllegalArgumentException("pass only 500$ as value ");
	}
	}
}
