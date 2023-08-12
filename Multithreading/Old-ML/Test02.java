class Test02{
	public static void main(String[] args){
		MyThread01 mt1=new MyThread01();
		MyThread01 mt2=new MyThread01("sundram1");
		System.out.println("MT1 Thread's initial name and priority");
		System.out.println("mt1 name:"+mt1.getName());
		System.out.println("mt1 priority"+mt1.getPriority());
		System.out.println("");
		System.out.println("mt2 thread's initial name and prioprity");
		System.out.println("MT2 name:"+mt2.getName());
		System.out.println("mt2 PRIOPRITY:"+mt2.getPriority());
		System.out.println("");
		mt1.setName("sundram dubey");
		mt1.setPriority(6);
		mt2.setPriority(9);
System.out.println("MT1 Thread's changed name and priority");
		System.out.println("mt1 name:"+mt1.getName());
		System.out.println("mt1 priority"+mt1.getPriority());
		System.out.println("");
        System.out.println("mt2 name"+mt2.getName());
		System.out.println("mt2 priority"+mt2.getPriority());
		mt1.start();
		mt2.start();
		for(int i=0;i<10;i++){
			System.out.println("main:"+i);
		}
	}
}
