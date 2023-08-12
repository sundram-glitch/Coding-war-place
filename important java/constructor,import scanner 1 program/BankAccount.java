//Encapsulation
class  BankAccoun {
private double balance;
public void setBalance(double amount){
	if(amount<=0){
		System.out.println("can enter -ve amount");
		this.balance=balance+amount;
	}
	else{
this.balance=balance+amount;
    }
}
public double getBalance(){
	return balance;
      }
}
