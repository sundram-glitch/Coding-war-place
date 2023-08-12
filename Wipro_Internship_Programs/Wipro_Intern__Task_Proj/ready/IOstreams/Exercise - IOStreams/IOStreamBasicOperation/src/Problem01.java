import java.util.*;
import java.io.*;
public class Problem01 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name or location:");
		String loc = sc.nextLine();
		try {
			//FileReader in  = new FileReader("inputFile.txt");
			FileReader in  = new FileReader(loc);
			System.out.print("Enter the character to be counted: ");
			char repOf = 0;
			String input = sc.next();
			if(input.length() == 1) 
				repOf = input.charAt(0);
			else {
				System.out.println("Input is not a character");
				System.exit(0);
			}
			int c;
			int count=0;
			while((c=in.read()) != -1)	
				if((((int)c) == (int)repOf) || (((int)c)+32 == (int)repOf) || (((int)c)-32 == (int)repOf))  
					count++;
			System.out.println("File '"+loc+"' has "+count+" instances of letter '"+repOf+"'");
			in.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.out.println("Enter valid file name or location");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
