import java.util.Scanner;
class  PalindromeString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(StringChallenge(sc.nextLine()));
	}//optional
	
	public static boolean StringChallenge(String str){
    String res = "";
	for (int i = 0; i < str.length() ; i++){
     if(str.charAt(i)!=' ')
	 res +=str.charAt(i);
	}
	StringBuffer sb = new StringBuffer(res);
	String newStr = String.valueOf(sb.reverse());
	if(newStr.equals(res))return true;
	else return false;
	}
}
