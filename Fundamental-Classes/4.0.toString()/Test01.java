//public String toString()
public class  Test01{
public static void main(String[] args) {
//1. class name 2. reference 3. state
 A a1 = new A(); 
 B b1 = new B();
 C c1 = new C();
//toString() method return value will be displayed 
// that value may be CN@hc or state of the object 
// it is depending on overriding toSting()
//by default toString() returns CN@hash code in hexa strig format
//from java.lang.Object. If we want to return state of this object, 
//we must override toStirng() method in our classs
 System.out.println(a1.toString());
 System.out.println(b1);
 System.out.println(c1.hashCode()==System.identityHashCode(c1));
 System.out.println(c1.hashCode());;;;;;
 System.out.println(c1.toString());//call toString() in its from  super cls and logic behind toString() is :
                                  //imp -->this.getClass.getName()+"@"+Integer.tohexa(this.hashCode);
								  //means it return cls name @ hashCode in hexaString format 10 hexa=a
 String s1 = "hari";
 Integer io1 = 7279;
 StringBuffer sb1 = new StringBuffer("NiT");
 StringBuilder sb2 = new StringBuilder("Ameerpet");
 System.out.println(s1);
 System.out.println(io1);
 System.out.println(sb1);
 System.out.println(sb2);
 char[] ch = {'a', 'b', 'c'};
 System.out.println(ch); //=> for loop content is displayed
 System.out.println("ch: "+ ch);  //=> ("ch: "+ch.toString())
 int[] ia = {1,2,3};
 System.out.println(ia);
 System.out.println(ia[0]);
 String[] sa = {"a", "b", "c"};
 System.out.println(sa);
 A[] aa = {new A(), new A(), new A()};
 System.out.println(aa);
 //System.out.println(null);
 System.out.println((String)null);
 System.out.println((A)null);
 System.out.println((int[])null);
 //System.out.println((char[])null);
 System.out.println("hi: "+(char[])null);//here char[] will convert into String becoz of "hi" is concatinated and from that toString() will be called
 }
}
class A{ int x = 10; 
@Override 
public String toString(){ 
	return "value of x:"+x; 
	}
};
class B{ int y = 20;
@Override
public String toString(){
	return "Sundram "+" Dubey";
	}
};
class C{ 
 int z = 30;
@Override 
 public int hashCode(){
 System.out.println("hC() is executed");
 return 10;
 }
}