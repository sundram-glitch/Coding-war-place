class  OCI01{
	//String size;
	int arg;
	String name;
   
    public void setSize(int arg){
    this.arg=arg;
	}
	public static void main(String[] args) 
	{
		OCI01 c1=new OCI01();
        c1.setSize(Integer.parseInt("S"));
		/*String Clothing[]; 
		String items[]={"shirt"};
		for(String c: items){
		if(items[c].size.equals(c.size)){
        //add to total
    }
		}
		OCI01 c1=new OCI01();
		int measurement = 3;
switch(measurement){
  case 3:
    c1.size = "S";
  case 6:
    c1.size = "M";
  case 9:
    c1.size = "L";
    break;
  default:
    c1.size = "X";
}*/
//System.out.println(c1.size);
System.out.println(c1.arg);
c1.name=Integer.toString(c1.arg);
System.out.println(c1.name);
c1.name=String.valueOf(c1.arg);
System.out.println(c1.name);
	}
}
