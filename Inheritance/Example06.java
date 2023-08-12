class Example06{
	private int x;
	
	Example06(int  x){
    System.out.println("i'm int construcotor");
		this.x=x;
	}
	Example06(Integer io){
	Example06 e1=new Example06(io);
	}
	Example06(String s){
		Example06 e2=new Example06(Integer.parseInt(s));
	}
	public int getX(){
				System.out.println("--------------------------------------");
		return x;
	}
}
