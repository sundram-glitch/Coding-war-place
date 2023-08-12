import java.io.*;  
class Parent{  
  void msg()throws ArithmeticException{System.out.println("parent");}  
}  
  
class TestExceptionChild2 extends Parent{  
  void msg()throws RuntimeException/*Exception:- not allowed it one checked-Exception*/{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild2();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  