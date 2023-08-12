 import java.lang.reflect.*;
public class Test{
	public static void main(String[] args)throws ClassNotFoundException{
	Class cls =Class.forName("Example");
	Field[] decFields=cls.getDeclaredFields();
System.out.println("NO. Of fields declared in example class:"+decFields.lenght);
Field[] fields=cls.getFields();
System.out.println("no of public fields declared in example class:"+fields.lenght);
		System.out.println("Hello World!");
	}
}
