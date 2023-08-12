public class ClassA
{
public void count(int i)
{
count(++i);
}
}
And:
ClassA a = new ClassA();
a.count(3);