class Node{
    private int NodeValue;
	private Node Next;
    
	public Node getNext(){
	return  Next;	
	}
	public void setNext(Node Next){
    this.Next = Next;
	}
    public int getValue(){
    return NodeValue;
	}
	public void setValue(int NodeValue){
    this.NodeValue = NodeValue;
	}
}

public class SingleLinkedList{
    private Node Head;
	private Node Tail;
    private Node node;
	private int  Size;
	
	public SingleLinkedList(int NodeValue){
    node = new Node();//Node-1
	node.setValue(NodeValue);//1010-> value-1
	node.setNext(null);//1010 -> null As SingleLinkedList
	Head = node;//Assigning First node reference to Head
	Tail = node;//Assigning First node to Tail
	Size+=1;
	}

	public void InsertAtFirst(int NodeValue)throws Exception{
    if(isEmpty()) throw new Exception ("lIST DOES NOT EXISTS");
	node = new Node();
	node.setValue(NodeValue);
    node.setNext(Head);//Change NewNodeHead.next ref to prev head ref
	Head = node;//Assign new node to NewNodeHead
	Size+=1;
	}

	public void InsertAtLast(int NodeValue)throws Exception{
    if(isEmpty()) throw new Exception ("lIST DOES NOT EXISTS");
	node = new Node();
	node.setValue(NodeValue);//new node with new value
	Tail.setNext(node);//old node with new ref
	Tail=node;//old node pointing with referece or say just for tracking purpose
	Size+=1;
	}

	public void InsertAt(int NodeValue,int Location)throws Exception{
    if(isEmpty()) throw new Exception ("lIST DOES NOT EXISTS");
	node = new Node();
	node.setValue(NodeValue);
	Node tempNode = Head;
	int index =1;
	while(index<Location-1){
    tempNode = tempNode.getNext();
	index++;
	}
	Node nextTemp = tempNode.getNext();
	node.setNext(nextTemp);
	tempNode.setNext(node);
	Size+=1;
	}
     
    public int Size(){
    return Size;
	}

	public boolean isEmpty(){
    return Head==null;
	}
 
    public void delete(int location)throws Exception{
    if(isEmpty()) throw new Exception ("lIST DOES NOT EXISTS");
	
	else if (location == 0){//Delete first (head) node
    Head = Head.getNext();//Change Head with Head.getNext() ref
	Size-=1;
	if(Size == 0)Tail=null;
	}//else if-1
	
	else if(location >= Size){
    Node tempNode = Head;
	for (int i=0;i<Size-1 ;i++ ){
	tempNode = tempNode.getNext();//temp points to 2nd last
	}
    if(tempNode==Head) Tail = Head = null;
	tempNode.setNext(null);
	Tail.setNext(tempNode);
	Size=-1;
	}//else if-2
	
	else{
    Node tempNode = Head;
    for (int i=0; i< location-1; )
    tempNode = tempNode.getNext();
	tempNode.setNext(tempNode.getNext().getNext());
	Size-=1;
	}//else
	}

    public void deleteAll(){
    Head=null;
	Tail=null;
	}

	public String toString(){
	if(isEmpty()) return ("lIST DOES NOT EXISTS");
	Node tempNode = Head;
	for (int i=0; i<=Size ;i++){
	System.out.print(tempNode.getValue());
	if(i<Size)System.out.print("-->");
	tempNode=tempNode.getNext();
	}
    return "";
	}

}
