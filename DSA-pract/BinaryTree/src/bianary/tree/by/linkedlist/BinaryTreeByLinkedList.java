package bianary.tree.by.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class BinaryTreeByLinkedList {
	   Binary_Node root,node ;
       //Constructor for creating a blank Binary Tree
	   public BinaryTreeByLinkedList(Binary_Node root) {
       this.root = root;
       }

	   void insert(int value) {
	   node = new Binary_Node(); 
	   node.setValue(value);
	   if(root == null) {
	   root = node;
	   System.out.println("Successfully inserted new Node");
	   return;
	   }
	Deque<Binary_Node> queue = new LinkedList<Binary_Node>();
	queue.add(root);
	while(!queue.isEmpty()) {
	Binary_Node present_node= queue.remove();
	if(present_node.getLeft()==null) {
	   present_node.setLeft(node);
	             break;           
	}
	else if(present_node.getRight() == null) {
		present_node.setRight(node);
		break;
	}
	else {
		queue.add(present_node.getLeft());
		queue.add(present_node.getRight());
	}
	}
	}
 }
