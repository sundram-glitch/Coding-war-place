 class Example{

	int x;
Example(){
this(60);
System.out.println("in no-param cons");
this.x=50;
System.out.println("end of "+this);
}

Example(int a){
this("70");
System.out.println("in int-param cons");
this.x=a;
}

Example(String str){
System.out.println("in String-param cons");
this.x=Integer.parseInt(str);
}
}//Example Class

 class Sample extends Example{
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

Sample(){
this(60);
System.out.println("in no-param cons");
this.x=50;
System.out.println("end of "+this);
}

Sample(int a){
this("70");
System.out.println("in int-param cons");
this.x=a;
}

Sample(String str){
System.out.println("in String-param cons");
this.x=Integer.parseInt(str);
}
}
 class Test_Sample{

	public static void main(String[] args){
		System.out.println("in start mian");
Sample e1=new Sample();
        System.out.println("e1.x:"+e1.x);
        System.out.println();
Sample e2=new Sample(5);
        System.out.println("e2.x:"+e2.x);
        System.out.println();
Sample e3=new Sample("80");
        System.out.println("e3.x:"+e3.x);
        System.out.println();
		System.out.println("in end mian");
	    System.out.println("count++:"+Sample.count);
	}
}