class Throws_Throw_Regarding_Points//throws ArithmeticException
{
	//throw new ArithmeticException();
	static //throws ArithmeticException
	{
		//throw new ArithmeticException();
	}
	{
	//throw new ArithmeticException
	}

static {
	try{throw new ArithmeticException();}
	catch(ArithmeticException ae){ }
    }
    Throws_Throw_Regarding_Points() throws ArithmeticException{
       throw new ArithmeticException();
	}
	void m1() throws ArithmeticException{
		throw new ArithmeticException();
	}
    void m2() //throw ArithmeticException 
	{
		//throws new ArithmeticException();
	}
	void m3() //throws String
	{
		//throw "abc";
	}
    void m4(){
		throw new ArithmeticException();
	//System.out.println("Hi");
	}
    void m5(){
	if(true){
		throw new ArithmeticException();
	}
	System.out.println("Hi");
	}
	void m6()throws ArithmeticException,IllegalArgumentException{
		//throw new ArithmeticException(),new IllegalArgumentException();
	}
	void m7(int x) throws ArithmeticException,IllegalArgumentException{
		throw new IllegalArgumentException();
	//  throw new ArithmeticException
	}
	void m8(int x)throws ArithmeticException,IllegalArgumentException{
		if(x<0){
			throw new IllegalArgumentException();
		}
		else if(x==0){
			throw new ArithmeticException();
		}
		System.out.println(x+" is correct value ");
	}

		public static void main(String[] args){

		System.out.println("Hello World!");
	}
}
