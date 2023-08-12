class HashCodeOvrDemo{
	int x=10;
	int y=20;
@Override
public int hashCode(){
	return x+y;
  }
}
class Example01{

	public static void main(String[] args){
		HashCodeOvrDemo e1=new HashCodeOvrDemo();
		HashCodeOvrDemo e2=new HashCodeOvrDemo();
		System.out.println(e1.hashCode()+"----------"+System.identityHashCode(e1));
		System.out.println(e2.hashCode()+"---------"+System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println("end of main!");
	}
}
