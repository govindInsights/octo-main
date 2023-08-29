package com.vruksha.common.exception;

/**
 * 
 * @author Govindarajan
 *
 */
public class ApplicationException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4435191147174364535L;

	// Constructors
    public ApplicationException() {
        super();
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    // Additional functionalities (can be customized)
    public void logException() {
        System.err.println("An ApplicationException occurred: " + this.getMessage());
        this.printStackTrace();
    }

    public String getCustomErrorMessage() {
        return "Custom error message: " + this.getMessage();
    }
}
