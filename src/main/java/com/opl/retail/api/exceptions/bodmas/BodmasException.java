package com.opl.retail.api.exceptions.bodmas;

public class BodmasException  extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3494092473797863483L;

	public BodmasException() {
		super();
	}

	public BodmasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BodmasException(String message, Throwable cause) {
		super(message, cause);
	}

	public BodmasException(String message) {
		super(message);
	}

	public BodmasException(Throwable cause) {
		super(cause);
	}

}
