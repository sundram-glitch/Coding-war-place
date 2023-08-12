class Modularity
{
	static int dfff=add(234,234);
    static int dff=sub(234,234);
	static int df=mul(234,234);
	static int d=div(234,234);
	static int add(int a,int b){ /*for calling from static block must method should contain return type*/
		//addition
		System.out.println( a+ b);
		return 0;
	  }
	  static int sub(int a,int b){
		//substraction
		System.out.println( a- b);
		return 0;
	  }
	  static int mul(int a,int b){
		//Multiplication
		System.out.println( a* b);
		return 0;
	  }
	  static int div(int a,int b){
		//division
		System.out.println( a/ b);
		return 0;
	}
public static void main(String[] args) 
	{
    a(10,20);
		 sub(30,40);
		   mul(50,60);
		   div(70,80);
		
	}
}
