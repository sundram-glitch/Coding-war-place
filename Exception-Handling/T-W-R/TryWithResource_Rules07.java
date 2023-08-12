//Rule#7: We can not used try-resource local-var
//from outside of try block,we will get CE: c f s 
//also we can not the outside try{} variable
//after try{ } if we assign it to try-resource local-var
//we will get RE: IOException stream closed

import java.io.*;

class  TryWithResource_Rules07{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
