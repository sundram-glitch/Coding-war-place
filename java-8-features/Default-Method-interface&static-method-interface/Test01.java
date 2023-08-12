interface Test01{
	public default void m1(){}
	//public static default void m2(){}
    //public final default void m2(){}
    //public abstract default void m2();
    //public native default void m2();
    //public transient default void m2();
    //public volatile default m2();
    //public synchronized default void m2(){}
      public strictfp default void m2(){}
    //protected default void m2(){}
      default void m3(){}
	//private default void m4(){}
	  public static void m5(){}
    //public final static void m6(){}
    //public final static void m7(){}
	//public abstract static void m8(){}
	//public abstract static void m9();
	  public abstract void m9();
	//public native static void m10();
    //public volatile static void m11();
    //public transient static void m12(){}
    //public synchronized static void m13(){}
	  public strictfp static void m14(){}
	//protected static void m15(){}
	  static void m16(){}

  private static void m17(){}//
	                        //=>allowed from Java-9v onward         
	   private void m18(){}//
}