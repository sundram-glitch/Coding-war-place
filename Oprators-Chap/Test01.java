class Test01 {
    public static void main( String args[] ) {
      System.out.println("HI");   
	  label:
		  ///int a=10;
	  for (int i=0;i<6;i++)
      {
        if (i==3)
        {
          continue label; //skips 3
        }
        System.out.println(i);
      }
    }
}