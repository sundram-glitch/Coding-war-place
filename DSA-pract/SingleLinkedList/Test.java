class  Test{
	public static void main(String[] args){
	SingleLinkedList list = new SingleLinkedList(5);
	System.out.println(list.isEmpty());
    try{
	list.InsertAtLast(20);
	list.InsertAtFirst(10);
	list.InsertAtLast(30);
	list.InsertAtFirst(2);
	list.InsertAt(3,2);

	System.out.println(list.Size());
	System.out.println(list);
	}
	catch(Exception e){
	System.out.println(e.getMessage());
	}
	}
}
