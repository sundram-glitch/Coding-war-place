class Sample01 extends Example01 {
static void m1(){
	System.out.println("Sample01 m1");
}
void m2(){
	System.out.println("Sample01 m2");
}
void m4(String s){
	System.out.println("String-param");
}
public static void main(String[] args) {
Sample01 s=new Sample01();
s.m1();
s.m2();
s.m3();
]s.m4();
s.m4("Sundram");
Example01 e=new Sample01();
//Sample01 s1=(Sample01)e;
e.m1();
e.m2();
e.m3();
//e.m4();
e.m4("Dubey");
		System.out.println("------------------------------------------------------------");
	}
    }