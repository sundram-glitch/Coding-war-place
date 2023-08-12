public class Circle implements Shape{
	public static final float Pi=3.14;
	private double radius;
	public void area(){
		System.out.println("Circle area:"+(Pi*radius*radius));
	}
	public void perimeter(){
		System.out.println("Circle perimeter:"+(2*Pi*radius));
	}
	public void printRadius(){
		System.out.println("Radius:"+radius);
	}
}
