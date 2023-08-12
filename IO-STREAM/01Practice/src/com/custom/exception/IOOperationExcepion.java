package com.custom.exception;

public class IOOperationExcepion  extends Exception{

	private static final long serialVersionUID = 1L;

	public IOOperationExcepion() {
    super();
	}
	public IOOperationExcepion(String errMsg) {
		super(errMsg);
	}
	public IOOperationExcepion(Exception cause) {
		super(cause);
	}
}
