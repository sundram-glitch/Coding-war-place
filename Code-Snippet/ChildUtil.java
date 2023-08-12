/*package testpkg.p2;
import  testpkg.p1;*/
class ParentUtil 
{
    public int x = 420;
    protected int doStuff() { return x; }
}
public class ChildUtil extends ParentUtil 
{
    public static void main(String [] args) 
    {
        new ChildUtil().callStuff();
    }
    void callStuff() 
    {
        System.out.print("this " + this.doStuff() ); /* Line 18 */
        ParentUtil p = new ParentUtil();
        System.out.print(" parent " + p.doStuff() ); /* Line 20 */
    }
}