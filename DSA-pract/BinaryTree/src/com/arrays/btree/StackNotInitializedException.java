package com.arrays.btree;

public class StackNotInitializedException extends Exception {

	private static final long serialVersionUID = 1L;

	public StackNotInitializedException() {
	super();
	}
	
	public  StackNotInitializedException(String msg){
		super(msg);
	}
}
