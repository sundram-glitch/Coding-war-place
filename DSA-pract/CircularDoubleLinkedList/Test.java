class Test{
	public static void main(String[] args)throws Exception{
CircularDoubleLinkedList list=new CircularDoubleLinkedList(10);
           list.insertAtFirst(5);
		   list.insertAtLast(20);
		   list.insertAt(15,2);
		   list.traverse();
		   list.reverseTraverse();
		System.out.println(list.size());
	}
}
