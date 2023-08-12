class  BadPoint
{
	static int a;
	static int b;

	static void m1(){

		a=10;/*it declared from class level variable that's why it will go and store instance varible memory*/
		b=20;
	}

	static void m2(int x,int y){
		a=x;
		b=y;
	}
	static void m3(int a,int b){                    //0....0

                                                   //10.....20

                                                  //30....40
                                                   //30....40

                                                    //70.....80
                                                    //Press any key to continue . . .

		              a=a;/*first a & b will read class variable  value because it initialized variable instance of class*/
		              b=b;
	}
		static void m4(int a,int b){
			BadPoint.a=a;/*here BadPoint is class name thats why it will also give most priority to instan variable values*/
            BadPoint.b=b;
		}
	public static void main(String[] args) 
	{
		System.out.println(a+"...."+b);
		System.out.println();

		m1();
		System.out.println(a+"....."+b);
		System.out.println();

		m2(30,40);
		System.out.println(a+"...."+b);
		System.out.println();

		m3(50,60);
		System.out.println(a+"...."+b);
		System.out.println();

		m4(70,80);
		System.out.println(a+"....."+b);

	}
	
}
