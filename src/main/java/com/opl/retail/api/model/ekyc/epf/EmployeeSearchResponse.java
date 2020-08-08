/**
 * 
 */
package com.opl.retail.api.model.ekyc.epf;

import java.util.List;

/**
 * @author sanket
 *
 */
public class EmployeeSearchResponse {

	private Integer statusCode;
	
	private String requestId;
	
	private List<EmployerSearchResult> result;
	
	
	
	
	

	/**
	 * @return the result
	 */
	public List<EmployerSearchResult> getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(List<EmployerSearchResult> result) {
		this.result = result;
	}

	/**
	 * @return the statusCode
	 */
	public Integer getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	
}
