 class Example_Flow_Cons_Chain{
	 static int count;
int x=m1();
	{//to count actually how many objs created place logic inside nsb
	    count++;
		System.out.println("IN SIDE NSB");
	}
	static{
	System.out.println("inside sb");
	}
int m1(){
	System.out.println("int m1 x"+x);
 return 40;
}

Example_Flow_Cons_Chain(){
this(60);
System.out.println("in no-param cons");
this.x=50;
System.out.println("end of "+this);
}

Example_Flow_Cons_Chain(int a){
this("70");
System.out.println("in int-param cons");
this.x=a;
}

Example_Flow_Cons_Chain(String str){
System.out.println("in String-param cons");
this.x=Integer.parseInt(str);
}
}
public class Test_Example_Flow_Cons_Chain{

	public static void main(String[] args){
		System.out.println("in start mian");
Example_Flow_Cons_Chain e1=new Example_Flow_Cons_Chain();
        System.out.println("e1.x:"+e1.x);
        System.out.println();
Example_Flow_Cons_Chain e2=new Example_Flow_Cons_Chain(5);
        System.out.println("e2.x:"+e2.x);
        System.out.println();
Example_Flow_Cons_Chain e3=new Example_Flow_Cons_Chain("80");
        System.out.println("e3.x:"+e3.x);
        System.out.println();
		System.out.println("in end mian");
	    System.out.println("count++:"+Example_Flow_Cons_Chain.count);
	}
}