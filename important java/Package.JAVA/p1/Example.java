package p1;
public class Example 
{
	static int a=978;
	private int x=34;
	        int y=323;
	static int b=java();
	public static int java(){
		Example e1=new Example();
		System.out.println("A"+a);
        System.out.println("x"+e1.x);
		System.out.println("y"+e1.y);
		System.out.println(b);
		System.out.println("M1 method is get executed");
    return 3243;
	}
	public void jvm(){
		Example e2=new Example();
		System.out.println(e2.a);
		System.out.println(e2.x);
		System.out.println(e2.y);
		System.out.println(e2.b);
	}
     static{
		 a=34;
		/* x=234;
  		 y=34;*/
        System.out.println("A"+a);
      /*  System.out.println("x"+x);
		System.out.println("y"+y);*/
		System.out.println(b);
		System.out.println("Hello World!");
	 }
	/* Example(){
	      a=34;
		 x=234;
  		 y=34;
        System.out.println("A"+a);
        System.out.println("x"+x);
		System.out.println("y"+y);
	 }*/
	/* Example(int x,int y){
//Read value dinamacally either kb\file\db
 Scanner scn=new scanner(System.in);
 System.out.println("\n Enter x value");
  this.x=scn.nextInt();
  System.out.println("\n Enter y value");
  this.y=scn.nextInt();*/
	 
	/* Example(int x,int y){
		 this.x=x;
         this.y=y;
	    }*/
}