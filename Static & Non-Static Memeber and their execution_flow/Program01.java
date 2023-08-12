
//Choose the output for given set of code:
public class Generic<T>
 {
     public T Field;
 }
 class Program01
 {
     static void Main(string[] args)
     {
         Generic<int> g2 = new Generic<int>();
         Generic<int> g3 = new Generic<int>();
         g2.Field = 8;
         g3.Field = 4;
         if (g2.Field % g3.Field == 0)
         {
             Console.WriteLine("A");
         }
         else
         Console.WriteLine("Prints nothing:");
         Console.ReadLine();
     }
 }
