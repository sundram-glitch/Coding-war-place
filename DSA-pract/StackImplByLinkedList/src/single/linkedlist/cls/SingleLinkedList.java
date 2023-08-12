package single.linkedlist.cls;

import com.node.cls.Node;

public class SingleLinkedList {
    private Node head,tail,node;
    private int  size;
    
    public Node createSingleLinkedList(int nodeValue) {
    node = new Node();
    node.setValue(nodeValue);
    node.setNext(null);
    head = node;
    tail=node;
    	return node;
    }
    
    public Node getHead() {
		return head;
	}
    
    public void setHead(Node head) {
		this.head = head;
	}
    
    public void setTail(Node tail) {
		this.tail = tail;
	}
    
    public Node getTail() {
		return tail;
	}
    
    public int getSize() {
		return size;
	}
    
    public void setSize(int size) {
		this.size = size;
	}
    
    private boolean isExists() {
	return head !=null;
	}
    
    private void check(int NodeValue)throws NoClassDefFoundError{
	if(!isExists())throw new NoClassDefFoundError("No such LinkedList Found!!");
	node = new Node();
	node.setValue(NodeValue);
	size++;
    }
    
    public void insertAtFirst(int NodeValue)throws NoClassDefFoundError {
    check(NodeValue);
    node.setNext(head);
    head=node;
	}
    
    public void insertAtLast(int NodeValue) throws NoClassDefFoundError{
    check(NodeValue);
    tail.setNext(node);
    tail=node;
    tail.setNext(null);
    }

    public void insertAt(int NodeValue,int location) {
    if(location<2) {
    	insertAtFirst(NodeValue);
    	return ;
    }
    else if (location>size) {
		insertAtLast(NodeValue);
		return ;
	}
    else {
    	check(NodeValue); 
	Node tempNode = head;
	int index=0;
	while (index<location) {
	tempNode=tempNode.getNext();		
	}
    Node nextNode = tempNode.getNext();
    tempNode.setNext(node);
    node.setNext(nextNode);
    }
    }
    
	public void deleteAtFirst() throws Exception {
	if(!isExists())throw new Exception("LinkedList deos not exists!!");
		head=head.getNext();
	    size--;
	    if(getSize()==0)head=null;
	} 
}