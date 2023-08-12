package com.wipro.org.AgeChecker;

public class InvalidAgeException extends Exception {
        public InvalidAgeException() {
        	super();
        }
        public InvalidAgeException(String msg) {
        	super(msg);
        }
        public InvalidAgeException(Exception cause) {
        	super(cause);
        }
}
