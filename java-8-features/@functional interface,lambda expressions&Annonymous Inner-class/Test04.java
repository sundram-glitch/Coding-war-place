@FunctionalInterface
interface Functional01{
int m1();
}
@FunctionalInterface
interface Functional02{
int m1();
}
@FunctionalInterface
interface Functional03{
int m1();
}
class Eval{
	public void Evalute(Functional01 i1){
    i1.m1();
	}

	public void Evalute(Functional02 i1){
    i1.m1();
	}

		public void Evalute(Functional03 i1){
    i1.m1();
	}
}
class  Test04{
	public static void main(String[] args){
		System.out.println("Hello World!");
		Eval eval=new Eval();
		eval.Evalute((Functional01)()->{System.out.println("HELlo from lamba 1"); return 5;});//Type cast to solve ambiguity errr
	}
}
