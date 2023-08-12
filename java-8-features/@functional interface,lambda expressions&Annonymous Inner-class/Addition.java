/*A functional interface is an interface that contains only one abstract method.
They can have only one functionality to exhibit. From Java 8 onwards,
lambda expressions can be used to represent the instance of a functional interface.
A functional interface can have any number of default methods. Runnable, ActionListener,
Comparable are some of the examples of functional interfaces.
Before Java 8, we had to create anonymous inner class objects or implement these interfaces.*/
@FunctionalInterface
interface Addition{
void add(int a,int b);
 default void  defaultMethod(){
System.out.println("defaultMethod of Addition");
}
public default void  d1efaultMethod(){
System.out.println("defaultMethod of Addition");
}
}
@FunctionalInterface
interface I1{
	//allowed
	void m1();
}

@FunctionalInterface
interface I2{
	void m2(int i);
//	void m2(long i);
//	void m2(double i);
}

@FunctionalInterface
interface I3{
	void m2(long i);
}

@FunctionalInterface
interface I4{
	void m2(double i);
}

@FunctionalInterface
interface I5<T>{
	void m2(T i);
}
@FunctionalInterface
interface I6<T>{
	T m2();
}



@FunctionalInterface
interface I7<T>{
	T m2(T t);
}


@FunctionalInterface
interface I8<T, R>{
	R m2(T t);
}


@FunctionalInterface
interface I9<T, U>{
	void m2(T t, U u);
}


@FunctionalInterface
interface I10<T, U>{
	T m2(T t, U u);
}

@FunctionalInterface
interface I101<T, U, R>{
	R m2(T t, U u);
}


@FunctionalInterface
interface I11<T, U, R>{
	R m2(T t, U u);
}


@FunctionalInterface
interface I12<T extends Thread , U extends Exception, R>{
	R m2(T t, U u);
}

@FunctionalInterface
interface I13<T extends Thread , U extends Exception, R>{
	R m2(T t, U u);
}


@FunctionalInterface
interface I14<T extends Thread , U extends Person, R>{
	R m2(T t, U u);
}

class Person
{
};



