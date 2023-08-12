class Test{
          public static final synchronized strictfp void main(String...args){
                 System.out.println("hello");
          }
}
class TestJava{
              public static void main(String...args){
                     Test.main();
              }
}