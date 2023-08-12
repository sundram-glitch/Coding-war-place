class G{
	int x=m1();
	int m1(){
	System.out.println("IN M1 METHOD!");
	return 10;
	}
	{
	System.out.println("NSB1 Executed!");
	//System.out.println("Value t "+t);//i f r
	}
    G(){
	System.out.println("NPC-Executed!");
	System.out.println("Value t "+t);//
	}
	G(String s){
	System.out.println("SPC-Executed!");
	}
    {
	System.out.println("NSB2-Executed!");
	}
	int t=m2();
	int m2(){
	System.out.println("IN M2 METHOD!");
	return 20;
	}
	public static void main(String[] args){
		G g1=new G();;
        G g2=new G("HK");G g3=new G();
		System.out.println("MM Executed end");
		System.out.println("Hello World!");
	}
	int z=m2();
	int m3(){
    System.out.println("IN M3 METHOD");
	return m1();
	}
    {
	System.out.println("IN NSB3!");
	}

}
