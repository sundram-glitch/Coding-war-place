class Redbus extends Bus{
void engine(){
  }
}
class Volvo extends Bus{
void engine(){
	System.out.println("Redbus engine capacity 40kmph");
}
	public static  void main(String[]args){
 Bus b=new Redbus();
 b.engine();
	}
}