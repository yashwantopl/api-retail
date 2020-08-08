package com.opl.retail.api.model.fitchengine;

import com.opl.retail.api.model.fitchengine.manufacturing.FinancialInputSheetManu;
import com.opl.retail.api.model.fitchengine.manufacturing.QualitativeInputSheetManuLong;
import com.opl.retail.api.model.fitchengine.service.FinancialInputSheetServ;
import com.opl.retail.api.model.fitchengine.service.QualitativeInputSheetServLong;
import com.opl.retail.api.model.fitchengine.trading.FinancialInputSheetTrad;
import com.opl.retail.api.model.fitchengine.trading.QualitativeInputSheetTradLong;

public class FitchRequest {

	private FinancialInputSheetManu financialInputSheetManu;
	
	private QualitativeInputSheetManuLong qualitativeInputSheetManu;
	
	
	private FinancialInputSheetServ financialInputSheetServ;
	
	private QualitativeInputSheetServLong qualitativeInputSheetServ;
	
	
	private FinancialInputSheetTrad financialInputSheetTrad;
	
	private QualitativeInputSheetTradLong qualitativeInputSheetTrad;

	
	public FinancialInputSheetManu getFinancialInputSheetManu() {
		return financialInputSheetManu;
	}

	public void setFinancialInputSheetManu(FinancialInputSheetManu financialInputSheetManu) {
		this.financialInputSheetManu = financialInputSheetManu;
	}

	public QualitativeInputSheetManuLong getQualitativeInputSheetManu() {
		return qualitativeInputSheetManu;
	}

	public void setQualitativeInputSheetManu(QualitativeInputSheetManuLong qualitativeInputSheetManu) {
		this.qualitativeInputSheetManu = qualitativeInputSheetManu;
	}

	public FinancialInputSheetServ getFinancialInputSheetServ() {
		return financialInputSheetServ;
	}

	public void setFinancialInputSheetServ(FinancialInputSheetServ financialInputSheetServ) {
		this.financialInputSheetServ = financialInputSheetServ;
	}

	public QualitativeInputSheetServLong getQualitativeInputSheetServ() {
		return qualitativeInputSheetServ;
	}

	public void setQualitativeInputSheetServ(QualitativeInputSheetServLong qualitativeInputSheetServ) {
		this.qualitativeInputSheetServ = qualitativeInputSheetServ;
	}

	public FinancialInputSheetTrad getFinancialInputSheetTrad() {
		return financialInputSheetTrad;
	}

	public void setFinancialInputSheetTrad(FinancialInputSheetTrad financialInputSheetTrad) {
		this.financialInputSheetTrad = financialInputSheetTrad;
	}

	public QualitativeInputSheetTradLong getQualitativeInputSheetTrad() {
		return qualitativeInputSheetTrad;
	}

	public void setQualitativeInputSheetTrad(QualitativeInputSheetTradLong qualitativeInputSheetTrad) {
		this.qualitativeInputSheetTrad = qualitativeInputSheetTrad;
	}

	
	
}