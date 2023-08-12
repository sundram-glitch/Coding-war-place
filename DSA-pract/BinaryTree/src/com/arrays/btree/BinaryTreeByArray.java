package com.arrays.btree;

public class BinaryTreeByArray {
    int arr[];
    int lastUsedIndex;
	public BinaryTreeByArray(int capacity) {
	this.lastUsedIndex=0;
	arr = new int[capacity];
	System.out.println("Arr created");
	}
	
	void insert(int value) throws StackOutBoundException {
	if(!isStackFull())  arr[++lastUsedIndex]=value; 
	else throw new StackOutBoundException("No more space available");
	}

	private boolean isStackFull()throws StackOutBoundException {
		return lastUsedIndex==arr.length-1? true:false;
	}
	
	private boolean isEmpty()throws StackNotInitializedException {
		return lastUsedIndex==0?true:false;
	}
	                                               // TRAVERSALS
	void levelOrder(int index) throws StackNotInitializedException {
		if(!isEmpty())
		System.out.print("[");
		for (int i = 1; i <=lastUsedIndex; i++) {
			System.out.print(arr[i]);
	       if(i!=lastUsedIndex)System.out.print(",");
		}
		System.out.println("]");
	}
 
	void preOrder(int index) throws StackNotInitializedException {
		if(index>lastUsedIndex | index==0)return;
		if(!isEmpty())
		System.out.print(arr[index]+", ");	
		preOrder(index*2);
		preOrder(index*2+1);
	}
	
	void inOrder(int index) throws StackNotInitializedException {
		if(index>lastUsedIndex | index==0)return;	
		if(!isEmpty())
    inOrder(index*2);
		System.out.print(arr[index]+",");
	inOrder(index*2+1);
	}
	
	void postOrder(int index)throws StackOutBoundException, StackNotInitializedException {
		if(index>lastUsedIndex | index==0)return;	
		if(!isEmpty()) 
    postOrder(index*2);
	postOrder(index*2+1);
	System.out.print(arr[index]);
	}
}
