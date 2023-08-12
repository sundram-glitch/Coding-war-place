
class Example01{
	static void m1(long l){
		System.out.println("long-args:"+l);
	}
    static void m1(Character a){
		System.out.println("Character-args"+a);
	}
	static void m1(Number n){
		System.out.println("number--args:"+n);
    }

	public static void main(String[] args){
	m1(50); 
	m1('a'); 
	m1(new Integer(50).intValue()); 
	m1(new Character('a').charValue());//all will call PDT
    m1(new Integer(50)); 
	m1(new Character('a')); 
	m1(new Long(70)); 
	m1(80.45);
	//m1(true);
		System.out.println("Hello World!");
	}
}
