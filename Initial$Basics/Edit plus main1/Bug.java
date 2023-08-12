class  Bug
{
	int eid ;
	String ename;
	String company;
	 public String toString(){
		  return "eid//;"+eid+"\n"+"ename:"+ename+"\n"+"company:"+company+"\n";
	  }
	public static void main(String[] args) 
	{
		Bug e1=new Bug();
		e1.eid=3984;
		System.out.println(e1);
	}
}
