public abstract class Person{
	private String name;
	private Address address;
	static{
	System.out.println("Person class SB is executed");
	System.out.println("Person class is loading is completed");
	}
	public Person(){
		System.out.println("Person class NPC is executed");
		System.out.println("Person calss NSVs initialization is completed");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(Address address){
		this.address=address;
	}
	public Address getAddress(){
		return address;
	}
	public void eat(){
		System.out.println(name+"is eating");
	}
	public void sleep(){
		System.out.println(name+"is sleeping");
	}

public abstract void learn();

 
}
