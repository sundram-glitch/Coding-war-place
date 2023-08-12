///Create ArrayList, add 10 words, write code to print all words in reverse, using Lamda Expression.
 	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
     **/
package lamdaExpression;
import java.util.ArrayList;
public class Problem2 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		///Adding words
		arrList.add("abc");
		arrList.add("def");
		arrList.add("ghi");
		arrList.add("jkl");
		arrList.add("mno");
		arrList.add("pqr");
		arrList.add("stu");
		arrList.add("vwx");
		arrList.add("yza");
		arrList.add("ABC");
		System.out.println(arrList); ///print actual list
		//Lamda expression for reversing the string
		arrList.forEach((s) -> System.out.println(new StringBuilder(s).reverse()));
	}
}
