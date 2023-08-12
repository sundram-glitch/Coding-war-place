
public class Puppy {

   public Puppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) {
     int puppyAge = age;
	   System.out.println("Puppy's age is :" + puppyAge );
   }
   public static void main(String []args) {
      /* Object creation */
      Puppy myPuppy = new Puppy( "tommy" );

      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age 

      /* You can access instance variable as follows as well */
   }
}