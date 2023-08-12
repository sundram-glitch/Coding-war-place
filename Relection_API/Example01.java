class Example01{
	public static void main(String[] args)throws ClassNotFoundException{
		System.out.println("main start !");
        Class cls = Class.forName("Instance");
		System.out.println("main end !");
	}
}
class Instance{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}