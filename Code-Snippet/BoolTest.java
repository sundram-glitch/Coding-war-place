public class BoolTest 
{
    public static void main(String [] args) 
    {
        Boolean b1 = new Boolean("false");
		System.out.println(b1);
        Boolean b2 = b1.booleanValue();
		System.out.println(b2);
        //b2 = b1.booleanValue();
        boolean flag = b2.booleanValue();
		System.out.println(!b1 +" 2 "+b2);
        if (!b1) 
        {
			System.out.println("3");
            b2 = true;
            System.out.print("x ");
        }
		System.out.println(b1+" 4 "+b2);
        if (b1 & b2) /* Line 13 */
        {
			System.out.println("5");
            System.out.print("y ");
        }
        System.out.println("z");
    }
}