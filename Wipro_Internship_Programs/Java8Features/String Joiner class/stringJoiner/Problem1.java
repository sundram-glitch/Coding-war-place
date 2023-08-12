//Given and ArrayList of n names, use StringJoiner to construct a new sequence of names separated by "," and enclosed in {} braces.
package stringJoiner;
import java.util.ArrayList;
import java.util.StringJoiner;
public class Problem1 {
	public static void main(String[] args) {
 	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
     **/
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Monday");
		arrList.add("Tuesday");
		arrList.add("Wednesday");
		arrList.add("Thursday");
		arrList.add("Friday");
		arrList.add("Saturday");
		arrList.add("Sunday");
		StringJoiner join = new StringJoiner(", ","{","}");
		arrList.forEach(s -> join.add(s));
		System.out.println("Strings joined using StringJoiner: \n"+join);
	}
}
