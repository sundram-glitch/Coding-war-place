import java.util.Scanner;
class Calculator{
	static double oprand1,oprand2;
	static char operator;
	public static void main(String[] args){
	   System.out.println("calci start!");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two values!");
	oprand1=scan.nextInt(); oprand2=scan.nextInt();
	 System.out.println("Select Operation -> + , - , * , / , % ");
	operator=scan.next().toCharArray()[0];
	switch(operator){
    case '+':
		//result=oprand1+oprand2;
		System.out.println("sumetion of two no ="+oprand1+"+"+oprand2+"="+(oprand1+oprand2));
	
	case '-':
		//result=oprand1+oprand2;
		System.out.println("substraction of two no ="+oprand1+"-"+oprand2+"="+(oprand1-oprand2));
		break;
	case '*':
		//result=oprand1+oprand2;
		System.out.println("multiplication of two no ="+oprand1+"*"+oprand2+"="+(oprand1*oprand2));
		break;
	case '/':
		//result=oprand1+oprand2;
		System.out.println("Division of two no ="+oprand1+"/"+oprand2+"="+(oprand1/oprand2));
		break;
	case '%':
		//result=oprand1+oprand2;
		System.out.println("Moduls of two no ="+oprand1+"%"+oprand2+"="+(oprand1%oprand2));
		break;
	default:
		System.out.println("Wrong operator");
	}
	}
}
