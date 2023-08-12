class C{
       static void m3(){
               System.out.println("C m3");
       }
       public static void main(String...args){
              System.out.println("C main");
              
              A.m1();
              B.m2();
              C.m3();
      }
}