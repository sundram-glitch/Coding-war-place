//Rule#2: if the resource object's close() method thrown a checked
//Exception either IOException or SQLException or some other
//checked exception,we must handle that exception either by reporting
//by using throws or by catch else we will get CE: Unreported Exception
import java.io.*;
class  TryWithResource_Rules02{
	public static void main(String[] args){
		System.out.println("start!");
		//try(PrintStream ps = new PrintStream(System.out)){ }
	//catch block does not required for above try,because
	//PS Class close() method does not throw IOException
    
	try(FileOutputStream FOS= new FileOutputStream("a.txt");FileInputStream f = new FileInputStream("a.txt")){ 
		for (int i=1;i<=127 ;i++ )
		FOS.write(i);
		int i;
		while((i=f.read())!=-1)
		System.out.println((char)i);
		}
	catch(FileNotFoundException e){  }
	catch(IOException e){ }
	//here we must place either catch(IOE) or throws IOE
	//Because FIS class close() method throws IOE
 }
}