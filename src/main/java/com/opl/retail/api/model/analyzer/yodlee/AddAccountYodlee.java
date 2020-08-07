package com.opl.retail.api.model.analyzer.yodlee;

import java.util.List;

public class AddAccountYodlee {
	private LoginForm loginForm;

	private List<AdditionalDataSet> additionalDataSet = null;

	public LoginForm getLoginForm() {
		return loginForm;
	}

	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}

	public List<AdditionalDataSet> getAdditionalDataSet() {
		return additionalDataSet;
	}

	public void setAdditionalDataSet(List<AdditionalDataSet> additionalDataSet) {
		this.additionalDataSet = additionalDataSet;
	}

	
	
	
}
