class Example{
	static void m1(int a){
		System.out.println("int-args:"+a);
	}
    static void m1(Integer a){
		System.out.println("Integer-args"+a);
	}

	public static void main(String[] args){
	m1(50); m1('a'); m1(new Integer(50).intValue()); m1(new Character('a')/*.charValue()*/);//all will call PDT
    m1(new Integer(50)); m1(new Character('a')); 
	//m1(new Long(70)); 
		System.out.println("Hello World!");
	}
}
