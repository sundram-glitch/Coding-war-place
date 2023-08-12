import java.io.FileOutputStream;
import java.io.FileNotFoundException;
class  Example{
	FileOutputStream fosh;
	static {
   System.out.println("SB executed");
	}

	Example(){
	try{	fosh=new FileOutputStream("abc.txt");
   System.out.println("Constructor executed");
	}
	catch(Exception  e){
    e.printStackTrace();
	}
	}
	protected void finalize(){
    System.out.println("finalize executed");
	try{
	fosh.close();
	}
	catch(Exception e){
    e.printStackTrace();
	}
	}
}
class Test01{

	public static void main(String[] args)throws Throwable{
		System.out.println("in main!");
		Example e1=new Example();
	    //e1.finalize();
		e1.fosh.write(11);
	    e1=null;
		System.gc();
	}
}