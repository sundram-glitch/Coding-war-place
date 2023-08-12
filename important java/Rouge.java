class Rouge 
{
	int eid;
	String ename;
	String company;
     //overriding toString() method to println object data
	 public String toString(){
		 return "eid:"+eid +"\n"+"ename:"+ename+"\n"+"company:"+company;
	 }

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Rouge r1=new Rouge();
		r1.eid=7279;
		r1.ename="Harikrishna";
		r1.company="Nareshit";

	  System.out.println(r1);
	  System.out.println(r1.eid);
	  System.out.println(r1.ename);
	  System.out.println(r1.company);

	  
	}
}
