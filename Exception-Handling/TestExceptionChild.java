//Rule:-In checked exception if super-class does not contain
//Checked exception then we are also not at all allowed to use
//in our sub-class any checked-exception else we will get C.E
//if Super-Class throw checked-exception then we have right to 
//avoid that exception or can throw same exception or it sub-class
import java.io.*;  
class Parent{  
  void msg()throws IOException{System.out.println("parent");}  
}  
  
class TestExceptionChild01 extends Parent{  
  void msg()throws IOException{  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild();  
   //p.msg(); //CE: 
   try{
	   p.msg();
   }
   catch(IOException e){
	  System.out.print("(:");
   }
  }  
}  