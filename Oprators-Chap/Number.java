class One {
public One() { System.out.print(1); }
}
class Two extends One {
public Two() { System.out.print(2); }
}
class Three extends Two {
public Three() { System.out.print(3); }
}
public class Number{
public static void main( String[] argv ) { new Three(); }
}

