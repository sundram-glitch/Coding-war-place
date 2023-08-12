class AUB{
  public void m1(int i){
   System.out.println("m1 int !");
  }
}
class AB extends AUB{
  void m1(Integer i){
   System.out.println("m1 int !");
  }
}
public class Test_AUB_AB{
	public static void main(String[] args){
		System.out.println("Hello World!");
		AUB aub=new AUB();
		aub.m1(10); aub.m1(new Integer(10));
        AUB ab=new AB();
		ab.m1(10); ab.m1(new Integer(10));
	}
}
