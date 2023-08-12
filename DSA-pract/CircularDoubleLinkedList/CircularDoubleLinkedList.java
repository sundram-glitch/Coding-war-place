class Node{
	private Node  next;
	private Node  prev;
	private int  value;

	public Node getNext(){
    return next;
	}
    public void setNext(Node next){
    this.next = next;
	}

	public Node getPrev(){
    return prev;
	}
	public void setPrev(Node prev){
    this.prev = prev;
	}

	public int getValue(){
    return value;
	}
	public void setValue(int value){
    this.value = value;
	}
} 
public class CircularDoubleLinkedList{
    private Node head,tail,node;
	private int size;
	public CircularDoubleLinkedList(int NodeValue){
    node =new Node();
	node.setValue(NodeValue);
	node.setNext(node);
	node.setPrev(node);
	head=node;//track to accss
	tail=node;//and modify
	size=1;
	}
    
	public boolean isExists(){
    return head!=null;
	}

	public void check(int nodeValue)throws Exception{
    if(!isExists())throw new Exception("LindkedList does'nt Exists!!");
	node = new Node();
	node.setValue(nodeValue);
	size++;
	}

	public int size(){
    return size;
	}
	public void insertAtFirst(int NodeValue)throws Exception{
     check(NodeValue);
	node.setNext(head);
	node.setPrev(tail);
	head.setPrev(node);
	head=node;//keep track of var value
	tail.setNext(node);
	}
    
	public void insertAtLast(int NodeValue)throws Exception{
     check(NodeValue);
	tail.setNext(node);
	node.setPrev(tail);
	tail=node;//keep track of var value
	tail.setNext(head);
	head.setPrev(tail);
	}

 	public void insertAt(int NodeValue,int location)throws Exception{
    if(location<=1){
    insertAtFirst(NodeValue);
	return ;
	}
	else if(location>size){
    insertAtLast(NodeValue);
	return ;
	}
    check(NodeValue);
    Node tempNode = head;
	for (int i =1;i<location-1;i++ ){
		tempNode = tempNode.getNext();
	}
	node.setPrev(tempNode);
	node.setNext(tempNode.getNext());
	tempNode.setNext(node);
	node.getNext().setPrev(node);
	}

	public void traverse()throws Exception{
    if(!isExists())throw new Exception("LinkedList does'nt exists!!");
	Node tempNode = head;
	for (int i=0;i<size;i++){
	System.out.print(tempNode.getValue());
	if(i<size-1)System.out.print("-->");
	tempNode = tempNode.getNext();
	}
	System.out.println();
	}
	public void reverseTraverse()throws Exception{
    if(!isExists())throw new Exception("LinkedList does'nt exists!!");
	Node tempNode = tail;
	for(int i=0;i<size;i++){
    System.out.print(tempNode.getValue());
	if(i<size-1)System.out.print("-->");
	tempNode = tempNode.getPrev();
	}
	System.out.println();
	}
	public void search(){
    
	}
    public void search(){
    Node tempNode=head;
	for (int i=0;i<size ;i++ ){
		if(tempNode.getValue()==NodeValue)
	System.out.print(i+" ");
		tempNode=tempNode.getNext();
	}
	System.out.println();
	}
	public void deleteAtFirst()throws Exception{
    if(!isExists())throw new Exception("LinkedList does'nt exists!!");
    if(size()==1){
		head.setNext(null);
		head.setPrev(null);
		head=tail=null;
		size--;
		return;
	}
	head = head.getNext();//go forward and take fourth reference
	head.setPrev(tail);
	tail.setNext(head);
	size--;
	}

	public void deleteAtLast()throws Exception{
    if(!isExists())throw new Exception("LinkedList does'nt exists!!");
    if(size()==1){
	head.setNext(null);
	head.setPrev(null);
	tail=head=null;
	size--;
	return;
	}
	tail=tail.getPrev();//go backward and take backed reference
	tail.setNext(head);
	head.setPrev(tail);
	size--;
	}

	public void delelteAt(int location)throws Exception{
    if(!isExists())throw new Exception("LinkedList does'nt exists!!");
	if(location<=1){
    deleteAtFirst();
	return;
	}
	else if(location>=size()){
    deleteAtLast();
	return;
	}
	else{
    Node tempNode = head;
    for (int i=0;i<location-1;i++)
		tempNode=tempNode.getNext();
		tempNode.setNext(tempNode.getNext().getNext());
		tempNode.getNext().setPrev(tempNode);
		size--;
	}
	}
}