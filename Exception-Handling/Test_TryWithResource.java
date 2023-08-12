import java.io.*;
class Test_TryWithResource{
	public static void main(String[] args){
		System.out.println("start !");
//From Java 7v onwards using try-with-resource we can write consice code as shown below:-
try(FileOutputStream fos2 = new FileOutputStream("abc.txt");){
	fos2.write("b");
  System.out.println("Data saved Successfully");
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
  }
}
