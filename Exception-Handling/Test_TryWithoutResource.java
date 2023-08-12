import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class  Test_TryWithoutResource{
	public static void main(String[] args){
		System.out.println("start!");
//Before Java 7v we must write code as shown below
FileOutputStream fos1 = null;
       try{
		   fos1 = new FileOutputStream("abc.txt");
		   fos1.write("b");
		System.out.println("Data saved successfully");
	   }
	   catch(IOException e){
		   e.printStackTrace();
	   }
	   finally{
		   try{
			  if(fos1!=null)
				  fos1.close();
		   }
		   catch(IOException e){
			   e.printStackTrace();
		   }
	   }
	}
}
