class I_Can{
	I_Can(){
    System.out.println("Inside no-peram of I_Can cls");
	}
	I_Can(long i){
    System.out.println("Inside int-param of I_Can cls");
	}
	I_Can(String str){
    System.out.println("Inside String-peram of I_Can cls");
	}
    
}


class Do_it extends I_Can{
	static int count;
	{
     count++;
	}
		Do_it (){
			this(60);
    System.out.println("Inside no-peram of I_Can cls");
	}
	Do_it (long i){
    this("Dueby ji");
	System.out.println("Inside int-param of I_Can cls"+i);
	}
	Do_it (String str){
    System.out.println("Inside String-peram of I_Can cls"+str);
	}
}

public class Test_i_can_do_it{
    
	public static void main(String[] args){
		System.out.println("start of main!");
	Do_it i=new  Do_it();
	Do_it can=new  Do_it(7054702937l);
	Do_it DO=new  Do_it("Sundram Dubey");
	System.out.println("total cons:"+Do_it.count);
	}
}
