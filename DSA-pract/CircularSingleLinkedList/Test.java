class Test{
	public static void main(String[] args){
CircularSingleLinkedList list=new CircularSingleLinkedList(10);
		try{
		System.out.println(list.isExists());
		list.insertAtFirst(5);
        list.insertAtLast(15);
		list.insertAt(20,4);
		list.search(10);
		list.delete(1);
		list.traverse();
		}
		catch(Exception e){
        System.out.println(e.getMessage());
		}
	}
}
