/*
 * Given a String adress, print address if it is not null, or else print default address as "India".
 */
package optionalClass;
import java.util.Optional;
public class Problem2 {
 	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
     **/
	String address;
	//String address = "Mumbai";
	String defaultAddress = "India";
	public static void main(String[] args) {
		Problem2 p2 = new Problem2();
		Optional<String> opt = Optional.ofNullable(p2.address);
		System.out.println(opt.orElse(p2.defaultAddress));
	}
}
