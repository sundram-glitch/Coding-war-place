interface NumberOperation{
	void eval(int x);
}

class Calc{
	static void process(NumberOperation expr){
		expr.eval(5);
    }
}

class EvenOddNumber implements NumberOperation{
public void eval(int x){
		System.out.println(x%2 == 0 ? x+" is even: ":x+" is odd ");
	}
}
class SquareNumber implements NumberOperation{
public void eval(int x){
	System.out.printf("\nthe square of the number %d is %d ",x,(x*x));
    }
}

class Test03{
	public static void main(String...args){
	//Approach #1:outer class as implementaion class
	Calc calci=new Calc();
	calci.process(new EvenOddNumber());
	System.out.println();
	Calc.process(new SquareNumber());
    System.out.println();
	//Approach #2:Annonymous Inner-Class as implementaion class
    calci.process(new NumberOperation(){
         public void eval(int x){
		 System.out.println("\nCube of the number "+x+" is "+(x*x*x));
		 }
	});
	System.out.println();
//Approach #3: LE wise implementaion
NumberOperation i=x->System.out.println("x"+5);
Calc.process(i);
Calc calci1=new Calc();
calci1.process(x->System.out.println("x----<"+5));
Calc.process((int x)->{System.out.println("10 times of "+x+" is "+x*10);});
System.out.println();
Calc.process((x)->{System.out.println("25 times of "+x+" is "+x*25);});
System.out.println();
Calc.process(x->{System.out.println("50 times of "+x+" is "+x*50);});
System.out.println();
Calc.process(x->{System.out.println("100 times of "+x+" is "+x*100); int y=x;});
Calc.process(x->System.out.println("200 times of "+x+" is "+x*200));
//Calc.process(x->System.out.println(this));there is no thiss
	}
};