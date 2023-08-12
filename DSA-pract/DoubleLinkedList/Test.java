class  Test/*DoubleLinkedList*/{
	public static void main(String[] args)throws Exception{
 DoubleLinkedList list = new DoubleLinkedList(10);
             list.insertAtFirst(5);
			 list.insertAtLast(15);
			 list.insertAt(20,2);
			 list.search(15);
			 //list.deleteAt(1);
			 //list.deleteAt(2);
		     //list.deleteAt(3);
			 list.reverseTraverse();
		System.out.println();
			 list.traverse();
		System.out.println("End of main!");
	}
}
