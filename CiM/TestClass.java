public class TestClass {

    public static void main(String[] args) {
        TestClass t = new TestClass();
		t.testMethod();
		/*DummyClass dummy = new DummyClass();
		dummy.implementMe();*/
    }
    static{
    System.out.println("Inside SB of outer class");
	}
    private static void testMethod() {
		 System.out.println("Before abs class TestMethod");
        abstract class TestMethod {
            int a;
            int b;
            int c;

            abstract void implementMe();
        }

        class DummyClass extends TestMethod {
            void implementMe() {
			System.out.println("implementMe");
			}
			DummyClass(){
            System.out.println("DummyClass() cons");
			}
			{
            System.out.println("DummyClass() NBS");
			}
			/*static{//Illegal static declaration in inner class DummyClas
            System.out.println("Inside SB of outer class");
	        }// modifier 'static' is only allowed in constant variable declarations*/
			/* public static void main(String[] args) {
        DummyClass t = new DummyClass();
		t.implementMe();
         }*/
       }
        System.out.println("end of TestMethod");
		DummyClass dummy = new DummyClass();
    }
}

/*class DummyCaller{
 
	 public static void main(String[] args) {
        DummyClass dummy = new DummyClass();
		dummy.implementMe();
    }
}*/