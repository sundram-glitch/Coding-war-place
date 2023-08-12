class Alter
{
   static int a=10;
   static int b=20;
   public static void main(String[]args){
	   System.out.println(a);
	   System.out.println(b);
	   int a=40;
	   int b=50;
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(Alter.a);
       System.out.println(Alter.b);
       }
}
/*10
20
50
10
20
20
printting via calling class or method*/