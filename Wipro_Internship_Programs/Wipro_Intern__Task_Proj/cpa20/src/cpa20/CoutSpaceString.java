package cpa20;




import java.util.*;
public class CoutSpaceString{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String strArr[] = str.split(" ");
	if(strArr.length!=0)System.out.println(strArr.length-1);
	else System.out.println("No spaces");
  }
}
