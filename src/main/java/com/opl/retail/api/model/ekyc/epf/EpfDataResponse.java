/**
 * 
 */
package com.opl.retail.api.model.ekyc.epf;

/**
 * @author sanket
 *
 */
public class EpfDataResponse {
	
	
	    private Long application_id;
	    
	    private Long coAppId;

	    private Object response;
	    
	    private Object defaulterResponse;

		/**
		 * @return the application_id
		 */
		public Long getApplication_id() {
			return application_id;
		}

		/**
		 * @param application_id the application_id to set
		 */
		public void setApplication_id(Long application_id) {
			this.application_id = application_id;
		}

		/**
		 * @return the response
		 */
		public Object getResponse() {
			return response;
		}

		/**
		 * @param response the response to set
		 */
		public void setResponse(Object response) {
			this.response = response;
		}

		/**
		 * @return the defaulterResponse
		 */
		public Object getDefaulterResponse() {
			return defaulterResponse;
		}

		/**
		 * @param defaulterResponse the defaulterResponse to set
		 */
		public void setDefaulterResponse(Object defaulterResponse) {
			this.defaulterResponse = defaulterResponse;
		}

		public Long getCoAppId() {
			return coAppId;
		}

		public void setCoAppId(Long coAppId) {
			this.coAppId = coAppId;
		}


	    
}
