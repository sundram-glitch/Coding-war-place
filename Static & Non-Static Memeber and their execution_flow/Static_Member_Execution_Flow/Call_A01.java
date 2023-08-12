class Call_A01{
	static int d=40;
	/*static{
    System.out.println("Call_A01 SB1 ");
	System.out.println("A01.a"+A01.a);
	System.out.println("Call_A01 SB1 end");
	}*/
	public static void main(String[] args){
	System.out.println("Call_A01 main!");
    System.out.println("A01.b"+A01.b);
	System.out.println("Call_A01 end'smain!");
	}
    /*static{
    System.out.println("Call_A01 SB2");
	System.out.println("A01.a"+A01.c);
	System.out.println("Call_A01 SB2 end");
	}*/
}
/*Call_A01 SB2
A01 SB1 Start
a:-10
A01 SB1 end
A01 SB2
A01 SB3
A01 SB4
A01.a30
Call_A01 SB2 end
Call_A01 main!
A01.b20*/