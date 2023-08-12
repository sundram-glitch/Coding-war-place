package com.wipro.org.customexception;

public class NegativeValueException extends Exception {
  public NegativeValueException() {
	  super();
  }
  public NegativeValueException(String msg) {
	  super(msg);
  }
  public NegativeValueException(Exception cause) {
	  super(cause);
  }
}
