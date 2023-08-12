class Generic<T> {
	public T Field;
	public void testSub(){
       T i=Field +1;
	}
}
public class Program
{

    static void main(String[] args) 
	{
	Generic<int> g = new Generic<int>();
	g.testSub();
	}
}
