class Node{
	private Node next;
	private Node prev;
	private int NodeValue;
    
	public Node getNext(){
    return next;
	}
	public void setNext(Node next){
    this.next=next;
	}

	public Node getPrev(){
    return prev;
	}
	public void setPrev(Node prev){
    this.prev=prev;
	}
	
	public int getValue(){
    return NodeValue;
	}
	public void setValue(int NodeValue){
    this.NodeValue=NodeValue;
	}


}
public class DoubleLinkedList{
    private Node head;
	private Node tail;
	private Node node;
	private int  size;
	public DoubleLinkedList(int NodeValue){
	node = new Node();
	node.setValue(NodeValue);
	node.setNext(null);
	node.setPrev(null);
	head=node;
	tail=node;
	size=1;
	}
    
	public boolean isExists(){
    return head!=null;//return false if null(!Exists) else return Exists
	}

	public void check(int NodeValue)throws Exception{
    if(!isExists())throw new Exception("Lindked list does not exists!!");
	node = new Node();
	node.setValue(NodeValue);
	size+=1;
	}

	public void insertAtFirst/*head*/(int NodeValue) throws Exception{
     check(NodeValue);
	head.setPrev(node);
	node.setPrev(null);
	node.setNext(head);
    head=node;
	}
	
	public void insertAtLast/*tail*/(int NodeValue) throws Exception{
     check(NodeValue);
	tail.setNext(node);
	node.setPrev(tail);
	node.setNext(null);
    tail=node;
	}

	public void insertAt/*LOCATION*/(int NodeValue,int location) throws Exception{
     check(NodeValue);
	if(location<=1){
    insertAtFirst(NodeValue);
	return;
	}
    else if(location>=size){
    insertAtLast(NodeValue);
	return;
	}
    Node tempNode = head;
	for (int i=1 ;i<location-1;i++ )
    tempNode = tempNode.getNext();
	Node nextNode = tempNode.getNext();   
	node.setNext(nextNode);
	node.setPrev(tempNode);
	tempNode.setNext(node);
	nextNode.setPrev(node);
   }
   
   public void traverse()throws Exception{
   if(!isExists())throw new Exception("Linkedlist does'nt exists!!");
   Node tempNode = head;
   for (int i = 0; i<size ;i++ ){
   System.out.print(tempNode.getValue());
   if(i!=size)System.out.print("-->");
   tempNode = tempNode.getNext();
   }
   }
   
   public void reverseTraverse()throws Exception{
   if(!isExists())throw new Exception("Linkedlist does'nt exists!!");
   Node tempNode = tail;
   for (int i = 0;i<size ;i++ ){
	   System.out.print(tempNode.getValue());
	   if(i!=size)System.out.print("-->");
	   tempNode = tempNode.getPrev();
	   
   }
   }
   public void search(int NodeValue)throws Exception{
   if(!isExists())throw new Exception("Linkedlist does'nt exists!!");
   Node tempNode = head;
   for (int i = 1; i<=size ;i++ ){
   if(tempNode.getValue()==NodeValue){
	   System.out.print(i+"\n");
   }
   tempNode = tempNode.getNext();
   }
   }

   public void deleteAtFirst()throws Exception{
   if(!isExists())throw new Exception("Linkedlist does not exists!!");
   head=head.getNext();
   head.setPrev(null);
   size-=1;
   if(size==0) head=tail=null;
   }
   
   public void deleteAtLast()throws Exception{
   if(!isExists())throw new Exception("Linkedlist does not exists!!");
   Node tempNode = tail.getPrev();
   if(tempNode==null){
   head=tail=null;
   size-=1; 
   return;
   }
   tempNode.setNext(null);
   tail=tempNode;
   size-=1;
   }

   public void deleteAt(int location)throws Exception{
   if(!isExists())throw new Exception("Linkedlist does not exists!!");
   if(location<=1){
   deleteAtFirst();
   return;
   }
   else if(location >= size){
   deleteAtLast();
   return;
   }
   Node tempNode = head;
   for (int i=1; i<location-1;i++ )
   tempNode = tempNode.getNext(); 
   tempNode.setNext(tempNode.getNext().getNext());
   tempNode.getNext().setPrev(tempNode);//3030.5050.setPrev(3030);
   size-=1;
  }
}