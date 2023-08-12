import java.io.*;
import java.util.Scanner;
public class Problem02 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
	    FileOutputStream out = null;
	    Scanner sc  = new Scanner(System.in);
	    System.out.println("Enter the input file name");
	    String s1 = sc.nextLine();
	    ///s1 = inputFile.txt;
	    System.out.println("Enter the output file name");
	    String s2 = sc.nextLine();
	    ////s2 = output.txt;
	    sc.close();
		try {
			in = new FileInputStream(s1);
			out = new FileOutputStream(s2);
			int c;
			int i=0;
			while((c=in.read()) != -1) {
				out.write(c);
				i++;
			}
			System.out.println("Number of characters is: "+i);
			System.out.println("File is copied!!");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.out.println("Enter valid file name or location");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
