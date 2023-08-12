package com.arrays.btree;

import java.util.Scanner;

public class Test {
public static void main(String[] args) throws StackOutBoundException, StackNotInitializedException {
	Scanner scn =new Scanner(System.in);
	BinaryTreeByArray btarr = new  BinaryTreeByArray(10);
	for (int i = 1; i <10; i++)
	btarr.insert(scn.nextInt());
	btarr.levelOrder(1);
	btarr.preOrder(1);
    btarr.inOrder(1);
    btarr.postOrder(1);
}
}
