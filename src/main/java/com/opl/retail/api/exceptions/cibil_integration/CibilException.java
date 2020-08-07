package com.opl.retail.api.exceptions.cibil_integration;

public class CibilException extends Exception {
    private static final long serialVersionUID = 1L;

    private Integer httpStatus; 
    
    public CibilException() {
        super();
    }

    public CibilException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CibilException(String message, Throwable cause) {
        super(message, cause);
    }

    public CibilException(String message) {
        super(message);
    }
    
    public CibilException(String message, Integer httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public CibilException(Throwable cause) {
        super(cause);
    }

	public Integer getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(Integer httpStatus) {
		this.httpStatus = httpStatus;
	}
    
    
}
