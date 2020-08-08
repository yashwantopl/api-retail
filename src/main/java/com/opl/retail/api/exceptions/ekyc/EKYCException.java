package com.opl.retail.api.exceptions.ekyc;

/** All E-KYC level exceptions
 * @author dharmendra.chudasama
 */
public class EKYCException extends RuntimeException {
	private static final long serialVersionUID = 1798922004488642877L;

	public EKYCException() {}

	/**
	 * @param message
	 */
	public EKYCException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public EKYCException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EKYCException(String message, Throwable cause) {
		super(message, cause);
	}

}