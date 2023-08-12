class Driver01{
	public static void main(String[] args){
		Vehicle v=new Redbus();
		v.breaks();
		v.engine();
				Vehicle b=new Volvo();
b.engine();
b.breaks();
				//Vehicle b1=new Vehicle();
//Vehicle is abstract can not be instantiate ok!
		System.out.println(";==============================================;");
	}
}
