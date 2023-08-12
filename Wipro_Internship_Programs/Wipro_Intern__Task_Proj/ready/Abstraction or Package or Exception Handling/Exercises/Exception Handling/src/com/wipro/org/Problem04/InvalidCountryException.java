package com.wipro.org.CourtryExceptionHandler;

public class InvalidCountryException extends Exception {
      public InvalidCountryException() {
    	  super();
      }
      public InvalidCountryException(String msg) {
    	  super(msg);
      }
      public InvalidCountryException(Exception cause) {
    	  super(cause);
      }
}
