//Create an Interface WordCount with single abstract method int count(String str),
//to count and return the number of words in given String.
//Implement count method using Lamda Expression in another class MyClassWithLamda.
//Invoke it to display the result on the console.

 	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
     **/
package lamdaExpression;
interface WordCount{
	public int count(String str);
}
class MyClassWithLamda implements WordCount{		
		public int count(String str) {
			WordCount func = string -> { return string.split(" ").length; };
			return 0;
		}
}
class Problem4 {
	public static void main(String[] args) {
		WordCount lmd = new MyClassWithLamda();
		System.out.println(lmd.count("My name is Khan."));
	}
}
