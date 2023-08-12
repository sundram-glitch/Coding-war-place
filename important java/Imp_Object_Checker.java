class OBJECT{
	 static void m1(Object obj){
     if(obj instanceof Object){
       System.out.println("instanceof"+obj);
	 }
     else{
     System.out.println("!a instance");
	 }
}
}
public class Imp_Object_Checker extends OBJECT{
	public static void main(String[] args){
		System.out.println("Hello World!");
        m1(new OBJECT());
	    m1(null);
	}
}
