///Create ArrayList, add 10 words, write code to print all words whose length is odd, using Lamda Expression.

 	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
     **/
package lamdaExpression;
import java.util.ArrayList;
public class Problem3 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		///Adding words
		arrList.add("hfsfs");
		arrList.add("deehsfert");
		arrList.add("dfgdsfhsd");
		arrList.add("jkldfgsdfgfrewf");
		arrList.add("mnoaergaqwed");
		arrList.add("reaysdff");
		arrList.add("afafra");
		arrList.add("vwx23t2re");
		arrList.add("ttjsrth");
		arrList.add("23twre");
		System.out.println(arrList); ///print actual list
		///Lamda expression for printing words with odd length
		arrList.forEach((s) ->{if(s.length()%2==1) System.out.println(s);});
	}

}
