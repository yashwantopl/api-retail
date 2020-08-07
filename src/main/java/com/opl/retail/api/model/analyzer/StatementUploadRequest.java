package com.opl.retail.api.model.analyzer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.opl.retail.api.model.analyzer.common.Statement;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatementUploadRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Statement> statements;

	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}
	
}
