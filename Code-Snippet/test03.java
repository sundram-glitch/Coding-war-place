public class test03 {
public static void main(String args[]) {
String s1 = "abc";
String s2 = new String("abc");

if(s1 == s2)
System.out.println(1);
else
System.out.println(2);
if(s1.equals(s2))
System.out.println(3);
else
System.out.println(4);
}
}