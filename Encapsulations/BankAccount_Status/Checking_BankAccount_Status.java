class Checking_BankAccount_Status{
	  public static void main(String[] args){
	  BankAccount_Status bas=new BankAccount_Status();
	  ba s.setStatus(true);
	  if(bas.getStatus()==true){
	  System.out.println("Account is active!");
      }
	  else{
	  System.out.println("Account is closed!");
	  }
	  bas.setStatus(false);
	  if(bas.getStatus()==false){
	  System.out.println("Account is closed!");
	  }
   	  else{
	  System.out.println("Account is active!");
	}
  }
}
