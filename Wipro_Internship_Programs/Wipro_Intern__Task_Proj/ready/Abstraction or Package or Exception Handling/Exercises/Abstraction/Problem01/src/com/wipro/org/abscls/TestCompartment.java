package com.wipro.org.abscls;
import java.util.Random;
public class TestCompartment {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    public static void main(String[] args) {
	Compartment[] arr = new Compartment[10];
	Compartment obj;
	Random ran = new Random();
	int num = ran.nextInt(4);
	for (int i = 0; i < arr.length; i++) {
	if(num==1) {
			obj = new FirstClass();
		    System.out.println(obj.notice());
	}
	else if(num==2) {
    	obj = new Ladies();
    	System.out.println(obj.notice());
    }
    else if(num==3) {
    	obj = new Luggage();
    	System.out.println(obj.notice());
    }
    else  {
    	obj = new General();
    	System.out.println(obj.notice());
    }
	arr[i] = obj;
	}
}
}
