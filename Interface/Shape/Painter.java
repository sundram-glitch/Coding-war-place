class Painter{
	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,20);
		r.area();
		r.perimeter();
		r.printLB();
		Square sq=new Square(10);
		sq.area();
		sq.perimeter();
		sq.printS();
		 
		Circle c=new Circle();
		c.area();
		c.perimeter();
		c.printRadius();
r=null; sq=null; c=null;  
Shape s;
s=new Rectangle(10,20);
s.area();
s.perimeter();  
//s.printLB();
((Rectangle)s).printS();
s=new Circle(10);
s.area();
s.perimeter();
((Circle)s).printRadius();

if (s instanceof Rectangle){
	((Rectangle)s).printLB();
}
else if (s instanceof Square){
	((Square)s).printS();
}
else if (s instanceof Circle){
	((Circle)s).printRadius();
}

		System.out.println("Hello World!");
}
}