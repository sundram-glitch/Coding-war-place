package user.test.cls;

import stack.linkedList.cls.StackByLinkedList;

public class Test {

	public static void main(String[] args) throws Exception {
	StackByLinkedList list=new StackByLinkedList(); 	
	for (int i = 0; i < 5; i++)
	list.push(i*5);
    for (int i = 0; i < 5; i++)
	System.out.println(list.pop());
    //System.out.println(list.pop());
	System.out.println();
	}

}
