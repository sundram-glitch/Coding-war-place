package stack.linkedList.cls;

import single.linkedlist.cls.SingleLinkedList;

public class StackByLinkedList {
	private SingleLinkedList list;
	
	public StackByLinkedList() {
	list = new SingleLinkedList(); 
	}
	
	public void push(int nodeValue){
    if(list.getHead()==null) list.createSingleLinkedList(5);
    else list.insertAt(nodeValue, 0);
	System.out.println(nodeValue+" insert into stack ");
	}
	
    public int  pop() throws Exception {
    int value = -1;
    if(isEmpty())throw new Exception();
    else value=list.getHead().getValue();
    deletion(0);//Always delete topMostElement and start pointing to nextElement in the index
	return value;
    }
    
	private boolean isEmpty() {
		return list.getHead()==null;
	}
	
	public void deletion(int i) throws Exception {
	list.deleteAtFirst();
	}
	
	public void deleteStack() {
	list.setHead(null);
	}
}