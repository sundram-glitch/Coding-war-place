//Rule#9: if we want to create or use multiple resources
//inside try(),we must separate them by using";"
//but not by using","
import java.io.*;

class TryWithResource_Rules08{
	public static void main(String[] args){
		System.out.println("start!");
		try(FileOutputStream fos = new FileOutputStream("abc.txt");
	        FileOutputStream fos1 = new FileOutputStream("abc.txt")){
			}
			FileOutputStream fos2 = new FileOutputStream("abc.txt");
			try(fos2;){ } 
			try(fos2){ } 
			FileOutputStream fos3 = new FileOutputStream("abc.txt");
			FileOutputStream fos4 = new FileOutputStream("bbc.txt");
			try(fos3;fos4){ }
			//try(fos3,fos4){ }
		}
}
