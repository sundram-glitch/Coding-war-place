public class Test{
	public static void main(String[] args){
		System.out.println("main");
		int x=0,y=10;
		try{
         y/=x;
		}
		System.out.println("/ by 0");
		catch(Exception e){
        System.out.println("err");
		}
	}
}//https://ide.geeksforgeeks.org/wXFSxy8I0Z
//https://ide.geeksforgeeks.org/t4MeQiPZUB